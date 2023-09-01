/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_juanflores;


public class Vendedor {
    private String nombre;
    private int cantidadCarrosVendidos, cantidadDineroGenerado;

    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    public Vendedor(String nombre, int cantidadCarrosVendidos, int cantidadDineroGenerado) {
        this.nombre = nombre;
        this.cantidadCarrosVendidos = cantidadCarrosVendidos;
        this.cantidadDineroGenerado = cantidadDineroGenerado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadCarrosVendidos() {
        return cantidadCarrosVendidos;
    }

    public void setCantidadCarrosVendidos(int cantidadCarrosVendidos) {
        this.cantidadCarrosVendidos = cantidadCarrosVendidos;
    }

    public int getCantidadDineroGenerado() {
        return cantidadDineroGenerado;
    }

    public void setCantidadDineroGenerado(int cantidadDineroGenerado) {
        this.cantidadDineroGenerado = cantidadDineroGenerado;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + '}';
    }
    
    
    
}
