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
public class Deportivo extends Vehiculo{

    private boolean descapotable;
    public Deportivo(){
        super();
    }
    
    public Deportivo(boolean descapotable, Integer idVehiculo, String marca, String modelo, String color, double precio, String categoria, int cantidad, boolean disponible) {
        super(idVehiculo, marca, modelo, color, precio, categoria, cantidad, disponible);
        this.descapotable = descapotable;
    }
}
