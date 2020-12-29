/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

public class main {

    public static void main(String[] args) {
        Vehiculo c1 = new Coche("Peugeot", "206", 4, 200000);
        Vehiculo m1 = new Moto("Honda", "Titan", 125, 60000);
        Vehiculo c2 = new Coche("Peugeot", "208", 5, 250000);
        Vehiculo m2 = new Moto("Yamaha", "YBR", 160, 80500.50);

        Concesionario c = new Concesionario();

        c.addVehiculo(c1);
        c.addVehiculo(m1);
        c.addVehiculo(c2);
        c.addVehiculo(m2);

        System.out.println(c);

        System.out.println("=============================");

        c.mascaroVehiculo();
        c.masbaratoVehiculo();
        c.letraYVehiculo();

        System.out.println("=============================");

        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        c.sortPrecio();

    }
}
