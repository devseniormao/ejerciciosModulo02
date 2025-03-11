package EjercicioClase05;

public class Main {
    public static void main(String[] args) {
        
        Cocina cocina = new Cocina("Cazuela de Fríjoles");
        Mesero mesero = new Mesero("Mauricio");
        Caja caja = new Caja(25000,100000);

        Restaurante restaurante = new Restaurante(cocina, caja, mesero);
        restaurante.operarRestaurante();
    }
}
