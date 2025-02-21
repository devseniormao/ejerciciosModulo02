import java.util.ArrayList;
import java.util.Scanner;

public class Moto extends Vehiculo {
    // Atributos
    private String tieneSideCar;

    // Constructor
    public Moto(String tipoVehiculo, String marca, String modelo, int velocidadMaxima, String tieneSideCar) {
        super(tipoVehiculo, marca, modelo, velocidadMaxima);
        this.tieneSideCar = tieneSideCar;
    }

    // Getters and Setters
    public String getTieneSideCar() {
        return tieneSideCar;
    }

    public void setTieneSideCar(String tieneSideCar) {
        this.tieneSideCar = tieneSideCar;
    }

    public void ingresarMoto(ArrayList<Moto> listaMotos, Scanner sc) {
        var salir = false;
        var tieneSidecar = "";
        do {
            System.out.print("Ingrese el tipo de vehículo: ");
            var tipoVehiculo = sc.nextLine();

            System.out.print("Ingrese la marca: ");
            var marcaVehiculo = sc.nextLine();

            System.out.print("Ingrese el modelo: ");
            var modeloVehiculo = sc.nextLine();

            System.out.print("Ingrese la velocidad máxima: ");
            var velocidadMaxVehiculo = sc.nextInt();

            var salirTieneSidecar = false;
            do {
                System.out.print("Tiene sidecar: ");
                tieneSidecar = sc.nextLine();
                if (tieneSidecar.toLowerCase().equals("si") || tieneSidecar.toLowerCase().equals("no")) {
                    salirTieneSidecar = true;
                } else {
                    System.out.println("En este ítem debe ingresar solo (si) o (no)");
                }
            } while (!salirTieneSidecar);

            Moto moto = new Moto(tipoVehiculo, marcaVehiculo, modeloVehiculo, velocidadMaxVehiculo,
                    tieneSidecar);
            listaMotos.add(moto);

        } while (!salir);
    }

    public void mostrarListaMotos(ArrayList<Moto> listaMotos) {
        String formato = "| %-15s | %-20s | %-10s | %-20d km/h | %-15s |";
        String formatHeader = "| %-15s | %-20s | %-10s | %-20s km/h | %-15s |";

        System.out.println("LISTADO DE MOTOS");
        System.out.println("---------------------------------------------------");
        System.out.printf(formatHeader, "TIPO VEHÍCULO", "MARCA", "MODELO", "VELOCIDAD MÁXIMA", "TIENE SIDECAR");
        System.out.println("---------------------------------------------------");

        if (listaMotos.isEmpty()) {
            System.out.println("No hay motos en la lista");
        } else {
            for (Moto moto : listaMotos) {
                System.out.printf(formato, moto.getTipoVehiculo(), moto.getMarca(), moto.getModelo(),
                        moto.getVelocidadMaxima(), tieneSideCar);
                System.out.println("---------------------------------------------------");
            }
        }
    }
}
