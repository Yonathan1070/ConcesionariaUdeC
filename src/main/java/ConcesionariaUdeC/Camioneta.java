package ConcesionariaUdeC;

/**
 *
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 * 
 * Clase donde se llaman las variables heredadas de Vehiculo y se declaaran las
 * variables propias de camioneta.
 */
public class Camioneta extends Vehiculo{

    private boolean platon;
    public Camioneta(){
        super();
    }
    public Camioneta(boolean platon, Integer idVehiculo, String marca, String modelo, String color, double precio, String categoria, int cantidad, boolean disponible) {
        super(idVehiculo, marca, modelo, color, precio, categoria, cantidad, disponible);
        this.platon = platon;
    }
}
