/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.catrina2.entidades;

import com.google.gson.Gson;
import java.util.List;

/**
 *
 * @author beltr
 */
public class Cuenta {
 private String producto;
 private String cuenta;
 private String clabe;
 private String moneda;
 private Cliente cliente;
 private List<Movimiento> movimientos;
 
 public Cuenta deserializar (String json){
         
         Cuenta cuenta = new Cuenta();
         try{
         cuenta = new Gson().fromJson(json,Cuenta.class);
         
         }catch(Exception c){
         System.err.println("Error: " + c.getMessage());
         }
         return cuenta;
         }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}
