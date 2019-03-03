package ConcesionariaUdeC;

/**
 *
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 * 
 * Clase donde se llaman las variables heredadas de la clase Vehiculo y se
 * declaran las variables propias de la Clase Deportivo.
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
