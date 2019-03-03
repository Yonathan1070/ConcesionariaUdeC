package ConcesionariaUdeC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Yonathan
 */
public class Agregar {
    boolean disponible = true, accesorioAdicional;
    int id=1;
    public BufferedReader entradaDatos = new BufferedReader (new InputStreamReader (System.in));
    public String opcion;
    public ArrayList<Vehiculo> vehiculos;
    
    public Agregar() {
        this.vehiculos = new ArrayList();
    }
    
    public void agregarVehiculoFamiliar() throws IOException{
        
        do{
            System.out.println("Digite la marca");
            String marca = entradaDatos.readLine();
            System.out.println("Digite el modelo");
            String modelo = entradaDatos.readLine();
            System.out.println("Digite el color");
            String color = entradaDatos.readLine();
            System.out.println("Digite el Precio");
            int precio = Integer.parseInt(entradaDatos.readLine());
            System.out.println("Cuantos Automoviles Llegaron?");
            int cantidad = Integer.parseInt(entradaDatos.readLine());
            Familiar nuevoFamiliar = new Familiar(id, marca, modelo, color, precio, "Familiar", cantidad, disponible);
            vehiculos.add(nuevoFamiliar);
            System.out.println("Desea Ingresar otro Automovil?");
            opcion=entradaDatos.readLine().toUpperCase();
            id++;
        }while(opcion.equals("S"));
    }
    
    public void agregarVehiculoDeportivo()throws IOException{
        String accesorio;
        do{
            System.out.println("Digite la marca");
            String marca = entradaDatos.readLine();
            System.out.println("Digite el modelo");
            String modelo = entradaDatos.readLine();
            System.out.println("Es descapotable? (1 = Si, 0 = No)");
            do{
                accesorio = entradaDatos.readLine();
                if(accesorio.equals("1") || accesorio.equals("0")){
                    accesorioAdicional = Boolean.parseBoolean(accesorio);
                }
                else{
                    System.out.println("Digite una opcion Válida.");
                }
            }while(!(accesorio.equals("1") || accesorio.equals("0")));
            System.out.println("Digite el color");
            String color = entradaDatos.readLine();
            System.out.println("Digite el Precio");
            int precio = Integer.parseInt(entradaDatos.readLine());
            System.out.println("Cuantos Automoviles Llegaron?");
            int cantidad = Integer.parseInt(entradaDatos.readLine());
            Deportivo nuevoDeportivo = new Deportivo(accesorioAdicional, id, marca, modelo, color, precio, "Deportivo", cantidad, disponible);
            vehiculos.add(nuevoDeportivo);
            System.out.println("Desea Ingresar otro Automovil?");
            opcion=entradaDatos.readLine().toUpperCase();
            id++;
        }while(opcion.equals("S"));
    }
    
    public void agregarVehiculoCamioneta()throws IOException{
        String accesorio;
        do{
            System.out.println("Digite la marca");
            String marca = entradaDatos.readLine();
            System.out.println("Digite el modelo");
            String modelo = entradaDatos.readLine();
            System.out.println("Tienew platon? (1 = Si, 0 = No)");
            do{
                accesorio = entradaDatos.readLine();
                if(accesorio.equals("1") || accesorio.equals("0")){
                    accesorioAdicional = Boolean.parseBoolean(accesorio);
                }
                else{
                    System.out.println("Digite una opcion Válida.");
                }
            }while(!(accesorio.equals("1") || accesorio.equals("0")));
            System.out.println("Digite el color");
            String color = entradaDatos.readLine();
            System.out.println("Digite el Precio");
            int precio = Integer.parseInt(entradaDatos.readLine());
            System.out.println("Cuantos Automoviles Llegaron?");
            int cantidad = Integer.parseInt(entradaDatos.readLine());
            Camioneta nuevoCamioneta = new Camioneta(accesorioAdicional, id, marca, modelo, color, precio, "Camioneta", cantidad, disponible);
            vehiculos.add(nuevoCamioneta);
            System.out.println("Desea Ingresar otro Automovil?");
            opcion=entradaDatos.readLine().toUpperCase();
            id++;
        }while(opcion.equals("S"));
    }
    
    public void getAutos(String categoria){
        for (int i=0; i<vehiculos.size();i++){
            if(vehiculos.get(i).categoria.equals(categoria)){
                System.out.println("Marca: "+vehiculos.get(i).marca+
                        "Modelo: "+vehiculos.get(i).modelo+
                        "Cantidad: "+vehiculos.get(i).cantidad);
                System.out.println("----------------------------------");
            }
        }
    }
}