package ConcesionariaUdeC;

/**
 *
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 * 
 * Clase donde se declaran las variables heredadas de la clase Persona y las 
 * variables propias del asesor.
 */
public class Asesor extends Persona{

    public Integer comisionVentas;
    public Asesor(){
        super();
    }
    
    public Asesor(Integer comisionVentas, Integer id, String cedula, String nombre, String correo, String direccion, String ciudad, String telefono, String rol) {
        super(id, cedula, nombre, correo, direccion, ciudad, telefono, rol);
        this.comisionVentas = comisionVentas;
    }

    public Integer getComisionVentas() {
        return comisionVentas;
    }

    public void setComisionVentas(Integer comisionVentas) {
        this.comisionVentas = comisionVentas;
    }
}
