import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
    
    //Atributos
    String nombre;
    int edad;
    float promedio;

    //constructor
    public Estudiante(String nombre, int edad, float promedio){
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getPromedio() {
        return promedio;
    }

    //Métodos
    public void ingresarEstudiantes(ArrayList<Estudiante> listaEstudiantes, Scanner sc){
        var continuar = false;

        do{
            System.out.print("Ingrese el nombre del estudiante: ");
            var nombreEstudiante = sc.nextLine();
            
            System.out.print("Ingrese la edad del estudiante: ");
            var edadEstudiante = sc.nextInt();
            
            System.out.print("Ingrese el promedio del estudiante: ");
            var promedioEstudiante = sc.nextFloat();
            sc.nextLine();

            Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante, promedioEstudiante);
            listaEstudiantes.add(estudiante);

            var salir = false;
            do{
            System.out.print("Desea ingresar un nuevo estudiante (s/n): ");
            var opcionNuevoEstudiante = sc.nextLine().toLowerCase();
            
            if(opcionNuevoEstudiante.equals("s")){
                salir = true;
            }else if(opcionNuevoEstudiante.equals("n")){
                salir = true;
                continuar = true;
            }else{
                System.out.println("ingresaste una opción inválida");
            }
            }while(!salir);
            
        }while(!continuar);
    }

    public void mostrarDetalles(ArrayList<Estudiante> listaEstudiantes){
        String formato = "|%-20s| | %-5d | |%-5.2f|%n";

        System.out.println("\n===========================================");
        System.out.printf("|%-20s| | %-5s | |%-5.2s|%n","NOMBRE","EDAD","PROMEDIO");
        System.out.println("===========================================");

        for (Estudiante estudiante : listaEstudiantes) {    
            System.out.printf(formato, estudiante.getNombre(), estudiante.getEdad(), estudiante.getPromedio());
        }        
    }
    
    public void estudiantesAprobados(ArrayList<Estudiante> listaEstudiantes){
        String formato = "|%-20s| | %-5d | |%-5.2f|%n";

        System.out.println("\n===========================================");
        System.out.printf("|%-20s| | %-5s | |%-5.2s|%n","NOMBRE","EDAD","PROMEDIO");
        System.out.println("===========================================");

        for (Estudiante estudiante : listaEstudiantes) {    
            if(estudiante.getPromedio()>=3){
                System.out.printf(formato, estudiante.getNombre(), estudiante.getEdad(), estudiante.getPromedio());
            }
        }        
    }

}
