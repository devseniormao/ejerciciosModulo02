import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ArrayList<Moto> listaMotos = new ArrayList<>();
        ArrayList<Carro> listaCarros = new ArrayList<>();

        var menuPrincipal = menuPrincipal(sc);

        var salir = false;
        do {
            switch (menuPrincipal) {
                case 1:
                    System.out.println("1. Motocicleta");
                    System.out.println("2. Vehículo");
                    var opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            Moto moto = new Moto(null, null, null, 0, null);
                            moto.ingresarMoto(listaMotos, sc);
                            break;

                        case 2:
                            Carro carro = new Carro(null, null, null, 0, 0);
                            carro.ingresarCarros(listaCarros, sc);
                            break;

                        default:
                            System.out.println("Ingresó una opción inválida, intente nuevamente");
                            break;
                    }
                    break;

                case 2:
                    Moto moto = new Moto(null, null, null, 0, null);
                    moto.mostrarListaMotos(listaMotos);
                    Carro carro = new Carro(null, null, null, 0, 0);
                    carro.mostrarListaCarros(listaCarros);
                    break;

                case 3:
                    Moto moto1 = new Moto(null, null, null, 0, null);
                    moto1.mostrarListaMotos(listaMotos);
                    break;
                case 4:
                    Carro carro1 = new Carro(null, null, null, 0, 0);
                    carro1.mostrarListaCarros(listaCarros);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Ingresó una opción inválida, intente nuevamente");
                    break;
            }
        } while (!salir);
        System.out.println("Salió del sistema satisfactoriamente");
    }

    // Menu principal
    public static int menuPrincipal(Scanner sc) {

        System.out.println("--- PROGRAMA PARA LA GESTIÓN DE VEHÍCULOS ---");
        System.out.println("Digite una de las siguientes opciones: ");
        System.out.println("1. Ingresar vehículo");
        System.out.println("2. Mostrar lista de vehículos");
        System.out.println("3. Mostrar Motocicletas");
        System.out.println("4. Mostrar Carros");
        System.out.println("5. Salir");
        var opcion = sc.nextInt();

        return opcion;
    }

}
