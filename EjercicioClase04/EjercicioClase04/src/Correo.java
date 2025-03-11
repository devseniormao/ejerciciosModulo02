public class Correo implements Notificaciones {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.printf("Usted tiene una notificación CORREO: %s", mensaje);
    }
    
}
