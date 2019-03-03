/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package ConcesionariaUdeC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Yonathan
 */
public class Menu {
    public BufferedReader entradaDatos = new BufferedReader (new InputStreamReader (System.in));
    public void Menu()throws IOException{
        String opcionMenu;
        do{
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            System.out.println("|     Bienvenido al Concesionario UdeC.     |");
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            System.out.println("|                                           |");
            System.out.println("|   1. Agregar Automovil.                   |");
            System.out.println("|   2. Agregar Persona.                     |");
            System.out.println("|   3. Ver Stock.                           |");
            System.out.println("|   4. Mas Vendido                          |");
            System.out.println("|   5. Comprar Automovil.                   |");
            System.out.println("|   0. Salir.                               |");
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            
            /**
             * Recibimos la opcion seleccionada.
             */
            opcionMenu=entradaDatos.readLine();
            
            switch(opcionMenu){
                case "1":
                    subMenuAutomovil();
                    break;
                case "2":
                    subMenuPersona();
                    break;
                case "3":
                    subMenuStock();
                    break;
                case "5":
                    subMenuCompra();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no válida\n\n");
                    break;
            }
        }while(opcionMenu != "0");
    }
    
    public void subMenuAutomovil()throws IOException{
        String opcionMenu;
        Agregar agregar = new Agregar();
        do{
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            System.out.println("|                                           |");
            System.out.println("|   1. Agregar Automovil Familiar.          |");
            System.out.println("|   2. Agregar Automovil Deportivo.         |");
            System.out.println("|   3. Agregar Camioneta.                   |");
            System.out.println("|   0. Atras.                               |");
            System.out.println("|                                           |");
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            
            opcionMenu=entradaDatos.readLine();
            
            switch(opcionMenu){
                case "1":
                    agregar.agregarVehiculoFamiliar();
                    break;
                case "2":
                    agregar.agregarVehiculoDeportivo();
                    break;
                case "3":
                    agregar.agregarVehiculoCamioneta();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opcion no válida\n\n");
                    break;
            }
        }while(opcionMenu == "0");
    }
    public void subMenuPersona()throws IOException{
        String opcionMenu;
        AgregarPersona agregar = new AgregarPersona();
        do{
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            System.out.println("|                                           |");
            System.out.println("|   1. Agregar Cliente.                     |");
            System.out.println("|   2. Agregar Asesor.                      |");
            System.out.println("|   0. Atras.                               |");
            System.out.println("|                                           |");
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            
            opcionMenu=entradaDatos.readLine();
            
            switch(opcionMenu){
                case "1":
                    agregar.agregarCiente();
                    break;
                case "2":
                    agregar.agregarAsesor();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opcion no válida\n\n");
                    break;
            }
        }while(opcionMenu == "0");
    }
    
    public void subMenuStock()throws IOException{
        String opcionMenu;
        Agregar buscar = new Agregar();
        do{
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            System.out.println("|                                           |");
            System.out.println("|   1. Familiar.                            |");
            System.out.println("|   2. Deportivo.                           |");
            System.out.println("|   3. Camioneta.                           |");
            System.out.println("|   0. Atras.                               |");
            System.out.println("|                                           |");
            System.out.println("+ - - - - - - - - - - - - - - - - - - - - - +");
            
            opcionMenu=entradaDatos.readLine();
            
            switch(opcionMenu){
                case "1":
                    buscar.getAutos("Familiar");
                    break;
                case "2":
                    buscar.getAutos("Deportivo");
                    break;
                case "3":
                    buscar.getAutos("Camioneta");
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Opcion no válida\n\n");
                    break;
            }
        }while(opcionMenu == "0");
    }
    
    public void subMenuCompra()throws IOException{
        ArrayList<Persona> cliente;
        System.out.println("Digite Documento Cliente.");
        String cedula=entradaDatos.readLine();
        AgregarPersona buscarCliente = new AgregarPersona();
        
        cliente = buscarCliente.obtenerPersonas(cedula, "Cliente");
    }
}
