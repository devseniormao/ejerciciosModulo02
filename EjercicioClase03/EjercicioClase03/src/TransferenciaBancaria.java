import java.util.ArrayList;

public class TransferenciaBancaria extends ProductoFinanciero implements Pago {

    private String tipoCuenta;

    public TransferenciaBancaria(int idProducto, double saldo, String tipoProducto, String tipoCuenta) {
        super(idProducto, saldo, tipoProducto);
        this.tipoCuenta = tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoCuenta(){
        return tipoCuenta;
    }

    @Override
    public String obtenerDetalles(ArrayList<ProductoFinanciero> productosFinancieros, double monto, int indexProducto) {
        return String.format("El pago fue exitoso:%nTipo de producto financiero: %s%nTipo de cuenta: %s%nId del producto: %d%nMonto pagado: %,.0f%nNuevo saldo: %,.0f%n"
        ,productosFinancieros.get(indexProducto).getTipoProducto(),
        ((TransferenciaBancaria) productosFinancieros.get(indexProducto)).getTipoCuenta(),
        productosFinancieros.get(indexProducto).getIdProducto(), monto,
         productosFinancieros.get(indexProducto).getSaldo());
    }

    @Override
    public void procesarPago(ArrayList<ProductoFinanciero> productosFinancieros, double monto, int idProducto,
            String tipoProducto, String banco) {
        boolean existeCuenta = validarExistenciaCuenta(productosFinancieros, monto, idProducto, tipoProducto, banco);
        boolean fondosSuficientes = validarMonto(productosFinancieros, monto, 
        idProducto, tipoProducto, banco);
        int indexProducto = 0;

        if(!existeCuenta){
            System.err.printf("El producto financiero con el Id número (%d) no existe", idProducto);
            return;
        }else if(!fondosSuficientes){
            System.err.printf("El producto financiero con el Id número (%d) no tiene fondos suficientes para el pago", idProducto);
            return;
        }else{
            for(ProductoFinanciero producto : productosFinancieros){
                if(producto.getIdProducto() == idProducto){
                    producto.setSaldo(producto.getSaldo()-monto);
                }
            }
        }

        for(int i = 0; i < productosFinancieros.size();i++){
            if(productosFinancieros.get(i).getTipoProducto() == tipoProducto &&
                productosFinancieros.get(i).getIdProducto() == idProducto){
                indexProducto = i;
                break;
            }
        }

        System.out.println("\n"+obtenerDetalles(productosFinancieros, monto, indexProducto));
        
    }

    @Override
    public boolean validarExistenciaCuenta(ArrayList<ProductoFinanciero> productosFinancieros, double monto,
            int idProducto, String tipoProducto, String banco) {
        for (ProductoFinanciero productos : productosFinancieros) {
        if(productos.getTipoProducto().equalsIgnoreCase(tipoProducto) && 
        productos.getIdProducto() == idProducto){
            return true;
        }
        }
        return false;
    }

    @Override
    public boolean validarMonto(ArrayList<ProductoFinanciero> productosFinancieros, double monto, int idProducto,
            String tipoProducto, String banco) {
        for(ProductoFinanciero producto : productosFinancieros){
            if(producto.getTipoProducto().equalsIgnoreCase(tipoProducto) &&
            producto.getIdProducto() == idProducto &&
            producto.getSaldo() >= monto){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "IdProducto: " + getIdProducto() + ", Saldo: " + getSaldo() + ", TipoProducto: " + getTipoProducto()
                + ", Titular: " + getTipoCuenta();
    }

}
