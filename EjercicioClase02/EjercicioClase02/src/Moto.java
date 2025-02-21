import java.util.ArrayList;
import java.util.Scanner;

public class Moto extends Vehiculo {
    // Atributos
    private String tieneSidecar;

    // Constructor
    public Moto(String tipoVehiculo, String marca, String modelo, int velocidadMaxima, String tieneSidecar) {
        super(tipoVehiculo, marca, modelo, velocidadMaxima);
        this.tieneSidecar = tieneSidecar;
    }

    // Getters and Setters
    public String gettieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(String tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    public void ingresarMoto(ArrayList<Moto> listaMotos, Scanner sc) {
        var salir = false;
        do {
            System.out.println("\n--- MÓDULO INGRESO DE MOTOCICLETAS ---");
            System.out.print("Ingrese el tipo de vehículo: ");
            var tipoVehiculo = sc.nextLine();

            System.out.print("Ingrese la marca: ");
            var marcaVehiculo = sc.nextLine();

            System.out.print("Ingrese el modelo: ");
            var modeloVehiculo = sc.nextLine();

            System.out.print("Ingrese la velocidad máxima: ");
            var velocidadMaxVehiculo = sc.nextInt();
            sc.nextLine();

            var salirTieneSidecar = false;
            String tieneSidecar = "";
            do {
                System.out.print("Tiene sidecar: ");
                tieneSidecar = sc.nextLine();
                if (tieneSidecar.equalsIgnoreCase("si") || tieneSidecar.equalsIgnoreCase("no")) {
                    salirTieneSidecar = true;
                } else {
                    System.out.println("En este ítem debe ingresar solo (si) o (no)");
                }
            } while (!salirTieneSidecar);

            Moto moto = new Moto(tipoVehiculo, marcaVehiculo, modeloVehiculo, velocidadMaxVehiculo, tieneSidecar);
            listaMotos.add(moto);

            System.out.print("¿Desea ingresar otra moto? (si/no): ");
            var respuesta = sc.nextLine();
            if(respuesta.equalsIgnoreCase("no")){
                salir = true;
            }

        } while (!salir);
    }

    public void mostrarListaMotos(ArrayList<Moto> listaMotos) {
        String formato = "| %-15s | %-20s | %-10s | %-20d km/h | %-15s |%n---------------------------------------------------------------------------------------------------------%n";
        String formatHeader = "---------------------------------------------------------------------------------------------------------%n| %-15s | %-20s | %-10s | %-20s km/h | %-15s |%n---------------------------------------------------------------------------------------------------------%n";

        System.out.println("\nLISTADO DE MOTOS");
        System.out.printf(formatHeader, "TIPO VEHÍCULO", "MARCA", "MODELO", "VELOCIDAD MÁXIMA", "TIENE SIDECAR");

        if (listaMotos.isEmpty()) {
            System.out.println("No hay motos en la lista");
        } else {
            for (Moto moto : listaMotos) {
                System.out.printf(formato, moto.getTipoVehiculo(), moto.getMarca(), moto.getModelo(),
                        moto.getVelocidadMaxima(), moto.gettieneSidecar());
            }
        }
    }
}
