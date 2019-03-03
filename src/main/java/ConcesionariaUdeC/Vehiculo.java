/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ConcesionariaUdeC;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yonathan
 */
public class Vehiculo {
    
    protected Integer idVehiculo;
    protected String marca;
    protected String modelo;
    protected String color;
    protected double precio;
    protected String categoria;
    public int cantidad;
    public boolean disponible;
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(Integer idVehiculo, String marca, String modelo, String color, double precio, String categoria, int cantidad, boolean disponible) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.categoria=categoria;
        this.cantidad=cantidad;
        this.disponible=disponible;
    }
    
    public Integer getIdVehiculo() {
        return idVehiculo;
    }
    
    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public boolean getDisponible() {
        return disponible;
    }
    
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
