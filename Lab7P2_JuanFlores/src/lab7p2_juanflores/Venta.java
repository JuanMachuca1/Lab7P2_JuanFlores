/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_juanflores;


public class Venta {
    private String vendedor;
    private String clienteCompro;
    private int CostoTransaccion;
    private String CarroVendido;

    public Venta(String vendedor, String clienteCompro, int CostoTransaccion, String CarroVendido) {
        this.vendedor = vendedor;
        this.clienteCompro = clienteCompro;
        this.CostoTransaccion = CostoTransaccion;
        this.CarroVendido = CarroVendido;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getClienteCompro() {
        return clienteCompro;
    }

    public void setClienteCompro(String clienteCompro) {
        this.clienteCompro = clienteCompro;
    }

    public int getCostoTransaccion() {
        return CostoTransaccion;
    }

    public void setCostoTransaccion(int CostoTransaccion) {
        this.CostoTransaccion = CostoTransaccion;
    }

    public String getCarroVendido() {
        return CarroVendido;
    }

    public void setCarroVendido(String CarroVendido) {
        this.CarroVendido = CarroVendido;
    }

    @Override
    public String toString() {
        return "Venta{" + "vendedor=" + vendedor + ", clienteCompro=" + clienteCompro + ", CostoTransaccion=" + CostoTransaccion + ", CarroVendido=" + CarroVendido + '}';
    }
    
        
}
