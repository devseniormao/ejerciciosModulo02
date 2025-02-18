import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        

        var salir = false;
        
        do{
            System.out.println("\n--- PROGRAMA PARA LA GESTIÓN DE ESTUDIANTES ---");
            System.out.println("1. Ingresar estudiantes");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Mostrar estudiantes aprobados");
            System.out.print("Elija la opción deseada: ");
            int opcion = sc.nextInt();
            sc.nextLine();
        
            switch(opcion){
                case 1:
                    new Estudiante("",0,0).ingresarEstudiantes(listaEstudiantes,sc);
                    break;
                case 2:
                    if(listaEstudiantes.isEmpty()){
                        System.out.println("\nNo has ingresado ningún estudiante");
                    } else{
                        new Estudiante("",0,0).mostrarDetalles(listaEstudiantes);
                    }
                    break;
                case 3: 
                    if(listaEstudiantes.isEmpty()){
                        System.out.println("No has ingresado ningún estudiante");
                    }else{
                        new Estudiante("",0,0).estudiantesAprobados(listaEstudiantes);
                    }
                    break;
                default:
                    System.out.println("Ingresó una opción inválida intente nuevamente");
            }    
        }while(!salir);

        sc.close();
    }
}
