/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcesionariaUdeC;

/**
 *
 * @author Yonathan
 */
public class Camioneta extends Vehiculo{

    private boolean platon;
    public Camioneta(){
        super();
    }
    public Camioneta(boolean platon, Integer idVehiculo, String marca, String modelo, String color, double precio) {
        super(idVehiculo, marca, modelo, color, precio);
        this.platon = platon;
    }
}
