import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static double monto = 0;
    public static int idProducto = 0;
    public static String tipoProducto = "";
    public static String banco = "";

    public static void main(String[] args) {

        ArrayList <ProductoFinanciero> productosFinancieros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        //Lista BitCoin
        ProductoFinanciero productoFinanciero = new BitCoin(1,50000,"BitCoin","Mauricio");
        productosFinancieros.add(productoFinanciero);
        ProductoFinanciero productoFinanciero1 = new BitCoin(2,120000,"BitCoin","Mauricio");
        productosFinancieros.add(productoFinanciero1);
        ProductoFinanciero productoFinanciero2 = new BitCoin(3,70000,"BitCoin","Mauricio");
        productosFinancieros.add(productoFinanciero2);
        
        //Lista PayPal
        ProductoFinanciero productoFinanciero3 = new PayPal(1,50000,"PayPal","Mauricio");
        productosFinancieros.add(productoFinanciero3);
        ProductoFinanciero productoFinanciero4 = new PayPal(2,120000,"PayPal","Mauricio");
        productosFinancieros.add(productoFinanciero4);
        ProductoFinanciero productoFinanciero5 = new PayPal(3,70000,"PayPal","Mauricio");
        productosFinancieros.add(productoFinanciero5);
        
        //Lista TarjetaCredito
        ProductoFinanciero productoFinanciero6 = new TarjetaCredito(1,50000,"TarjetaCredito","BancoPopular");
        productosFinancieros.add(productoFinanciero6);
        ProductoFinanciero productoFinanciero7 = new TarjetaCredito(2,120000,"TarjetaCredito","BancoGanadero");
        productosFinancieros.add(productoFinanciero7);
        ProductoFinanciero productoFinanciero8 = new TarjetaCredito(3,70000,"TarjetaCredito","Bancolombia");
        productosFinancieros.add(productoFinanciero8);
        
        //Lista TarjetaRegalo
        ProductoFinanciero productoFinanciero9 = new TarjetaRegalo(1,50000,"TarjetaRegalo","Marcelo");
        productosFinancieros.add(productoFinanciero9);
        ProductoFinanciero productoFinanciero10 = new TarjetaRegalo(2,120000,"TarjetaRegalo","Marcelo");
        productosFinancieros.add(productoFinanciero10);
        ProductoFinanciero productoFinanciero11 = new TarjetaRegalo(3,70000,"TarjetaRegalo","Marcelo");
        productosFinancieros.add(productoFinanciero11);

        //Lista TransferenciaBancaria
        ProductoFinanciero productoFinanciero12 = new TransferenciaBancaria(1,50000,"TransferenciaBancaria","Ahorros");
        productosFinancieros.add(productoFinanciero12);
        ProductoFinanciero productoFinanciero13 = new TransferenciaBancaria(2,120000,"TransferenciaBancaria","Corriente");
        productosFinancieros.add(productoFinanciero13);
        ProductoFinanciero productoFinanciero14 = new TransferenciaBancaria(3,70000,"TransferenciaBancaria","Ahorros");
        productosFinancieros.add(productoFinanciero14);

        BitCoin bitCoin = new BitCoin(0,0,"","");
        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria(0,0,"","");
        PayPal payPal = new PayPal(0,0,"","");
        TarjetaCredito tarjetaCredito = new TarjetaCredito(0,0,"","");
        TarjetaRegalo tarjetaRegalo = new TarjetaRegalo(0,0,"","");
        boolean salida = false;
        
        do{
            
            System.out.println("\n--- PROGRAMA PARA EL PROCESAMIENTO DE PAGOS ---\n");
            System.out.println("Elija una opción de pago de la lista:");
            System.out.println("1. BitCoin");
            System.out.println("2. PayPal");
            System.out.println("3. Tarjeta de crédito");
            System.out.println("4. Tarjeta de Regalo");
            System.out.println("5. Trasferencia bancaria");
            System.out.println("6. Salir");
            System.out.print("Digite el número de opción deseado: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    tipoProducto = "BitCoin";
                    System.out.println("\n--- MENU DE PAGOS BITCOIN ---");
                    System.out.print("Ingrese el Id del producto financiero o número de cuenta: ");
                    idProducto = sc.nextInt();
                    System.out.print("Ingrese el monto a pagar: ");
                    monto = sc.nextDouble();

                    bitCoin.procesarPago(productosFinancieros, monto, idProducto, tipoProducto, banco);
                    break;
                    
                case 2:
                    tipoProducto = "PayPal";
                    System.out.println("\n--- MENU DE PAGOS PAYPAL ---");
                    System.out.print("Ingrese el Id del producto financiero o número de cuenta: ");
                    idProducto = sc.nextInt();
                    System.out.print("Ingrese el monto a pagar: ");
                    monto = sc.nextDouble();

                    payPal.procesarPago(productosFinancieros, monto, idProducto, tipoProducto, banco);
                    break;
                
                case 3:
                    tipoProducto = "TarjetaCredito";
                    System.out.println("\n--- MENU DE PAGOS TARJETA DE CRÉDITO ---");
                    System.out.print("Ingrese el Id del producto financiero o número de cuenta: ");
                    idProducto = sc.nextInt();
                    System.out.print("Ingrese el monto a pagar: ");
                    monto = sc.nextDouble();

                    tarjetaCredito.procesarPago(productosFinancieros, monto, idProducto, tipoProducto, banco);
                    break;
                
                case 4:
                    tipoProducto = "TarjetaRegalo";
                    System.out.println("\n--- MENU DE PAGOS TARJETA DE REGALO ---");
                    System.out.print("Ingrese el Id del producto financiero o número de cuenta: ");
                    idProducto = sc.nextInt();
                    System.out.print("Ingrese el monto a pagar: ");
                    monto = sc.nextDouble();

                    tarjetaRegalo.procesarPago(productosFinancieros, monto, idProducto, tipoProducto, banco);
                    break;
                
                case 5:
                    tipoProducto = "TransferenciaBancaria";
                    System.out.println("\n--- MENU DE PAGOS TRASFERENCIA BANCARIA ---");
                    System.out.print("Ingrese el Id del producto financiero o número de cuenta: ");
                    idProducto = sc.nextInt();
                    System.out.print("Ingrese el monto a pagar: ");
                    monto = sc.nextDouble();

                    transferenciaBancaria.procesarPago(productosFinancieros, monto, idProducto, tipoProducto, banco);
                    break;
                
                case 6:
                    System.out.println("Salió del programa");
                    salida = true;
                    break;
                
                default:
                    break;
            }

        }while(!salida);

        sc.close();
    }
}
