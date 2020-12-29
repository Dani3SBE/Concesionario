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
public class Coche extends Vehiculo {

    private int puertas;

    public Coche(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return this.puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca: " + this.getMarca()
                + " // Modelo: " + this.getModelo()
                + " // Puertas: " + this.getPuertas()
                + " // Precio: $" + String.format("%.2f", this.getPrecio());
    }
}
