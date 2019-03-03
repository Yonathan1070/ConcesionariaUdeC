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
public class Cliente extends Persona{

    public Cliente(){
        super();
    }
    
    public Cliente(Integer id, String cedula, String nombre, String correo, String direccion, String ciudad, String telefono, String rol) {
        super(id, cedula, nombre, correo, direccion, ciudad, telefono, rol);
    }
}
