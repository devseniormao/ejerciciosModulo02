package EjercicioClase05;

public class Mesero {
    
    private String nombreMesero;

    public void servir(){
        System.out.println("El mesero "+ nombreMesero +" esta sirviendo el plato");
    }

    public Mesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }

    public String getNombreMesero() {
        return nombreMesero;
    }

    public void setNombreMesero(String nombreMesero) {
        this.nombreMesero = nombreMesero;
    }    

}
