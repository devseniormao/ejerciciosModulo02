import java.util.ArrayList;

public interface Pago {

    void procesarPago(ArrayList <ProductoFinanciero> productosFinancieros, double monto, 
    int idProducto, String tipoProducto, String banco);
    
    String obtenerDetalles(ArrayList <ProductoFinanciero> productosFinancieros, double monto, int indexProducto);

    boolean validarMonto(ArrayList <ProductoFinanciero> productosFinancieros, double monto, int idProducto, String tipoProducto, String banco);
    
    boolean validarExistenciaCuenta(ArrayList <ProductoFinanciero> productosFinancieros, double monto, int idProducto, String tipoProducto, String banco);
        
} 