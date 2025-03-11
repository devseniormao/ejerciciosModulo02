package EjercicioClase05;
public class Cocina {
    
    private String nombrePlato;

    public void prepararPlato(){
        System.out.println("Plato preparado:" + nombrePlato);
    }

    public Cocina(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

}
