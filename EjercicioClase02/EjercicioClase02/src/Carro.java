import java.util.ArrayList;
import java.util.Scanner;

public class Carro extends Vehiculo {
    // Atributos
    private int numPuertas;

    // Constructor
    public Carro(String tipoVehiculo, String marca, String modelo, int velocidadMaxima, int numPuertas) {
        super(tipoVehiculo, marca, modelo, velocidadMaxima);
        this.numPuertas = numPuertas;
    }

    // Getters and Seters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void ingresarCarros(ArrayList<Carro> listaCarros, Scanner sc) {
        var salir = false;
        do {
            System.out.print("Ingrese el tipo de vehículo: ");
            var tipoVehiculo = sc.nextLine();

            System.out.print("Ingrese la marca: ");
            var marcaVehiculo = sc.nextLine();

            System.out.print("Ingrese el modelo: ");
            var modeloVehiculo = sc.nextLine();

            System.out.print("Ingrese la velocidad máxima: ");
            var velocidadMaxVehiculo = sc.nextInt();
            
            System.out.print("Ingrese el número de puertas: ");
            var numeroPuertasVehiculo = sc.nextInt();
            sc.nextLine();

            Carro carro = new Carro(tipoVehiculo, marcaVehiculo, modeloVehiculo, velocidadMaxVehiculo,
                    numeroPuertasVehiculo);
            listaCarros.add(carro);

            System.out.print("Desea ingresar otro carro (si/no): ");
            var respuesta = sc.nextLine();

            if(respuesta.equalsIgnoreCase("no")){
                salir = true;
            }

        } while (!salir);
    }

    public void mostrarListaCarros(ArrayList<Carro> listaCarros) {
        String formato = "| %-15s | %-20s | %-10s | %-20d km/h | %-15s |%n---------------------------------------------------------------------------------------------------------%n";
        String formatHeader = "---------------------------------------------------------------------------------------------------------%n| %-15s | %-20s | %-10s | %-20s km/h | %-15s |%n---------------------------------------------------------------------------------------------------------%n";

        System.out.println("\nLISTADO DE CARROS");
        System.out.printf(formatHeader, "TIPO VEHÍCULO", "MARCA", "MODELO", "VELOCIDAD MÁXIMA", "NUMERO DE PUERTAS");

        if (listaCarros.isEmpty()) {
            System.out.println("No hay vehículos en la lista");
        } else {
            for (Carro carro : listaCarros) {
                System.out.printf(formato, carro.getTipoVehiculo(), carro.getMarca(), carro.getModelo(),
                        carro.getVelocidadMaxima(), carro.getNumPuertas());
            }
        }
    }
}
