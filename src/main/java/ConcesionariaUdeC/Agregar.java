/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ConcesionariaUdeC;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Yonathan
 */
public class Agregar {
    public BufferedReader entradaDatos = new BufferedReader (new InputStreamReader (System.in));
    public ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
    
    public void agregarVehiculoFamiliar(){
        Familiar cielo = new Familiar(1, "Daewoo", "Cielo", "Azul", 100);
        Familiar atos = new Familiar(2, "Hyundai", "Atos", "Plateado", 200);
        Familiar iDiez = new Familiar(3, "Hyundai", "Grand i10", "Gris", 300);
        Familiar accent = new Familiar(4, "Hyunday", "Accent Vision", "Negro", 250);
        Familiar optra = new Familiar(5, "Chevrolet", "Optra", "Rojo", 150);
        vehiculos.add(cielo);
        vehiculos.add(atos);
        vehiculos.add(iDiez);
        vehiculos.add(accent);
        vehiculos.add(optra);
        
        for (Vehiculo stock : vehiculos) {
            System.out.println("  -> "+stock.getMarca()+" "+stock.getModelo());
        }
    }
    
    public void agregarVehiculoDeportivo(){
        Deportivo mx = new Deportivo(true, 1, "Mazda", "MX-5", "Rojo", 23000);
        Deportivo corvette = new Deportivo(false, 2, "Chevrolet", "Corvette ZR1", "Gris", 108091);
        Deportivo bmw = new Deportivo(true, 3, "BMW", "Serie 4 Cabrio", "Blanco", 47550);
        Deportivo aston = new Deportivo(false, 4, "Aston Martin", "Vantage", "Verde", 178000);
        Deportivo land = new Deportivo(true, 5, "Land Rover", "Evoque Convertible", "Naranja", 54700);
        vehiculos.add(mx);
        vehiculos.add(corvette);
        vehiculos.add(bmw);
        vehiculos.add(aston);
        vehiculos.add(land);
        
        for (Vehiculo stock : vehiculos) {
            System.out.println("  -> "+stock.getMarca()+" "+stock.getModelo());
        }
    }
    
    public void agregarVehiculoCamioneta(){
        Camioneta dMax = new Camioneta(true, 1, "Chevrolet", "D-MAX", "Gris", 24250);
        Camioneta cx = new Camioneta(false, 2, "Mazda", "CX-5", "Rojo", 26775);
        Camioneta duty = new Camioneta(true, 3, "Ford", "Super Duty 2019", "Azul", 33150);
        Camioneta ram = new Camioneta(true, 4, "Ram", "Laramie", "Banco", 56200);
        Camioneta porsche = new Camioneta(false, 5, "Porsche", "Cayenne", "Vinotinto", 199707);
        vehiculos.add(dMax);
        vehiculos.add(cx);
        vehiculos.add(duty);
        vehiculos.add(ram);
        vehiculos.add(porsche);
        
        for (Vehiculo stock : vehiculos) {
            System.out.println("  -> "+stock.getMarca()+" "+stock.getModelo());
        }
    }
}
