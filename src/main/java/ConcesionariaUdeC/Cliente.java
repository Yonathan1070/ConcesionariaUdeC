package ConcesionariaUdeC;

/**
 *
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 * 
 * Clase donde se llaman las variables heredadas de la clase Persona y de seclaran
 * las variables propias del Cliente.
 */
public class Cliente extends Persona{

    public Cliente(){
        super();
    }
    
    public Cliente(Integer id, String cedula, String nombre, String correo, String direccion, String ciudad, String telefono, String rol) {
        super(id, cedula, nombre, correo, direccion, ciudad, telefono, rol);
    }
}
