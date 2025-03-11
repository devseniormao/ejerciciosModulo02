package EjercicioClase05;

public class Caja {
    
    private double valorPlato;
    private double pago;
    private double cambio;
    
    public Caja(double valorPlato, double pago) {
        this.valorPlato = valorPlato;
        this.pago = pago;
    }

    public void procesarPago(){
        if(pago < valorPlato){
            System.err.println("El valor no es suficiente para pagar el plato");
        }else{
            cambio = pago - valorPlato;
            System.out.printf("Pago procesado:%nValor del plato: %,.0f%nValor pagado: %,.0f%nCambio: %,.0f",valorPlato, pago, cambio);
        }        
    }

    public double getValorPlato() {
        return valorPlato;
    }

    public void setValorPlato(double valorPlato) {
        this.valorPlato = valorPlato;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

}
