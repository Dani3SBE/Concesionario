/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Asus
 */
public class Concesionario {

    private List<Vehiculo> listaVehiculos;

    public Concesionario() {
        this.listaVehiculos = new ArrayList<>();
    }

    public List<Vehiculo> getListaVehiculos() {
        return this.listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public boolean addVehiculo(Vehiculo vehiculo) {
        if (!this.listaVehiculos.stream().noneMatch((v) -> (v.equals(vehiculo)))) {
            return false;
        }
        this.listaVehiculos.add(vehiculo);
        return true;
    }

    public void mascaroVehiculo() {
        double max = 0;
        String resul = "";

        for (Vehiculo v : this.listaVehiculos) {
            if (v.getPrecio() > max) {
                max = v.getPrecio();
                resul = "Vehículo más caro: " + v.getMarca() + " " + v.getModelo();
            }
        }
        System.out.println(resul);
    }

    /**
     *
     */
    public void masbaratoVehiculo() {
        double min = 999999999;
        String resul = "";

        for (Vehiculo v : this.listaVehiculos) {
            if (v.getPrecio() < min) {
                min = v.getPrecio();
                resul = "Vehículo más barato: " + v.getMarca() + " " + v.getModelo();
            }
        }
        System.out.println(resul);
    }

    public void letraYVehiculo() {
        String resul = "Vehículo que contiene en el modelo la letra ‘Y’: ";

        for (Vehiculo v : this.listaVehiculos) {
            if (v.getModelo().contains("Y")) {
                resul = "Vehículo que contiene en el modelo la letra ‘Y’: "
                        + v.getMarca() + " "
                        + v.getModelo() + " $"
                        + String.format("%.2f", v.getPrecio());
                System.out.println(resul);
            }
        }
    }

    /**
     *
     */
    public void sortPrecio() {

        Collections.sort(this.listaVehiculos);

        this.listaVehiculos.forEach((v) -> {
            System.out.println(v.getMarca() + " " + v.getModelo());
        });
    }

    @Override
    public String toString() {
        String resul = "";
        for (Vehiculo v : this.listaVehiculos) {
            resul = resul + "\n" + v.toString();
        }
        return resul;
    }

}
