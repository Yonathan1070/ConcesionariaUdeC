package ConcesionariaUdeC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Yonathan Bohorquez
 * @author Manuel Bohorquez
 * 
 * Clase donde se agregan nuevas personas dependiendo del Rol ya sea Cliente
 * o Asesor
 */
public class AgregarPersona {
    int id=1;
    public String opcion;
    public BufferedReader entradaDatos = new BufferedReader (new InputStreamReader (System.in));
    public ArrayList<Persona> personas;
    
    public AgregarPersona() {
        this.personas = new ArrayList();
    }
    
    public void agregarAsesor()throws IOException{
        do{
            System.out.println("Digite Cedula");
            String cedulaAsesor = entradaDatos.readLine();
            System.out.println("Digite Nombre");
            String nombreAsesor = entradaDatos.readLine();
            System.out.println("Digite Correo");
            String correoAsesor = entradaDatos.readLine();
            System.out.println("Digite Direccion Domicilio");
            String direccionAsesor = entradaDatos.readLine();
            System.out.println("Digite Ciudad Domicilio");
            String ciudadAsesor = entradaDatos.readLine();
            System.out.println("Digite No Celular");
            String celularAsesor = entradaDatos.readLine();
            Asesor nuevoAsesor = new Asesor(20, id, cedulaAsesor, nombreAsesor, correoAsesor, direccionAsesor, ciudadAsesor, celularAsesor, "Asesor");
            personas.add(nuevoAsesor);
            System.out.println("Desea Ingresar otro Asesor?");
            opcion=entradaDatos.readLine().toUpperCase();
            id++;
        }while(opcion.equals("S"));
    }
    
    public void agregarCiente()throws IOException{
        do{
            System.out.println("Digite Cedula");
            String cedulaCliente = entradaDatos.readLine();
            System.out.println("Digite Nombre");
            String nombreCliente = entradaDatos.readLine();
            System.out.println("Digite Correo");
            String correoCliente = entradaDatos.readLine();
            System.out.println("Digite Direccion Domicilio");
            String direccionCliente = entradaDatos.readLine();
            System.out.println("Digite Ciudad Domicilio");
            String ciudadCliente = entradaDatos.readLine();
            System.out.println("Digite No Celular");
            String celularCliente = entradaDatos.readLine();
            Cliente nuevoCliente = new Cliente(id, cedulaCliente, nombreCliente, correoCliente, direccionCliente, ciudadCliente, celularCliente, "Cliente");
            personas.add(nuevoCliente);
            System.out.println("Desea Ingresar otro Cliente?");
            opcion=entradaDatos.readLine().toUpperCase();
            id++;
        }while(opcion.equals("S"));
    }
    
    //Metodos para obtener el listado de los clientes registrados.
    public void obtenerPersonas(){
        for (Persona persona : personas){
            System.out.println("  -> "+persona.getCedula()+" "+persona.getNombre());
        }
    }
    public ArrayList obtenerPersonas(String cedula, String rol){
        ArrayList<Persona> cliente=new ArrayList();
        for (Persona persona : personas){
            cliente.add(persona);
            System.out.println("  -> "+persona.getCedula()+" "+persona.getNombre());
        }
        return cliente;
    }
}
