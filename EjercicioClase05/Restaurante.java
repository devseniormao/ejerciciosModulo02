package EjercicioClase05;

public class Restaurante {
    
    private Cocina cocina; 
    private Caja caja;
    private Mesero mesero;
    
    public Restaurante(Cocina cocina, Caja caja, Mesero mesero) {
        this.cocina = cocina;
        this.caja = caja;
        this.mesero = mesero;
    }

    public void operarRestaurante(){
        cocina.prepararPlato();
        mesero.servir();
        caja.procesarPago();
    }
    
}
