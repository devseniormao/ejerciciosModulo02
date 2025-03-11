public class ProductoFinanciero {

    private int idProducto;
    private double saldo;
    private String tipoProducto;
    
    public ProductoFinanciero(int idProducto, double saldo, String tipoProducto) {
        this.idProducto = idProducto;
        this.saldo = saldo;
        this.tipoProducto = tipoProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    
    
} 