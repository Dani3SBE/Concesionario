/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author Asus
 */
public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto(String marca, String modelo, int cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + this.getMarca()
                + " // Modelo: " + this.getModelo()
                + " // Cilindrada: " + this.getCilindrada()
                + "cc // Precio: $" + String.format("%.2f", this.getPrecio());
    }
}
