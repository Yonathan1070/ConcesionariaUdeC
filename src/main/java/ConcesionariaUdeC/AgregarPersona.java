/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcesionariaUdeC;

import java.util.ArrayList;

/**
 *
 * @author Yonathan
 */
public class AgregarPersona {
    public ArrayList<Persona> personas = new ArrayList<Persona>();
    
    public void agregarAsesor(){
        Asesor jose = new Asesor(20, 1, "80393256", "José Moncada", "josemon@hotmail.com", "Cll 5 # 13-18", "Facatativá", "3108799688");
        Asesor alirio = new Asesor(20, 1, "80393257", "Alirio Mendez", "alirimendez@hotmail.com", "Cll 4c # 13-18", "Facatativá", "3108799689");
        Asesor edison = new Asesor(20, 1, "1070954014", "Edison Nieto", "edini@hotmail.com", "Cra 14 # 4b-14", "Facatativá", "3108799690");
        Asesor maria = new Asesor(20, 1, "35526078", "Maria Rincon", "mariarin@hotmail.com", "Cll 5 # 14-19", "Facatativá", "3108799691");
        Asesor rosa = new Asesor(20, 1, "35526079", "Rosa Romero", "rosaro@hotmail.com", "Cll 8 # 19-28", "Facatativá", "3108799692");
        
        personas.add(jose);
        personas.add(alirio);
        personas.add(edison);
        personas.add(maria);
        personas.add(rosa);
        
        for (Persona listaAsesores : personas) {
            System.out.println("  -> "+listaAsesores.getCedula()+" -> "+listaAsesores.getNombre());
        }
    }
    
    public void agregarCiente(){
        Cliente mauricio = new Cliente(1, "80393256", "Mauricio Mendez", "maumen@hotmail.com", "Cll 5 # 13-18", "Facatativá", "3108799688");
        Cliente joma = new Cliente(1, "80393257", "Joma Vega", "jomavega@hotmail.com", "Cll 4c # 13-18", "Facatativá", "3108799689");
        Cliente juan = new Cliente(1, "1070954014", "Juan Rincon", "juanse@hotmail.com", "Cra 14 # 4b-14", "Facatativá", "3108799690");
        Cliente jenny = new Cliente(1, "35526078", "Jenny Olaya", "jennyol@hotmail.com", "Cll 5 # 14-19", "Facatativá", "3108799691");
        Cliente vanessa = new Cliente(1, "35526079", "Vanessa Rincon", "vaneri@hotmail.com", "Cll 8 # 19-28", "Facatativá", "3108799692");
        
        personas.add(mauricio);
        personas.add(joma);
        personas.add(juan);
        personas.add(jenny);
        personas.add(vanessa);
        
        for (Persona listaAsesores : personas) {
            System.out.println("  -> "+listaAsesores.getCedula()+" -> "+listaAsesores.getNombre());
        }
    }
}
