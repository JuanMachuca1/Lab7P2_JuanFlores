/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_juanflores;

import java.awt.Color;


public class Vehiculo {
    private  String marca;
    private Color color;
    private int año;
    private double precioVenta;
    //id para puntos extra
    
    
    public Vehiculo(String marca, Color color, int año, double precioVenta) {
        this.marca = marca;
        this.color = color;
        this.año = año;
        this.precioVenta = precioVenta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", color=" + color + ", a\u00f1o=" + año + ", precioVenta=" + precioVenta + '}';
    }
    
    
    
}
