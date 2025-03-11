public class Sms implements Notificaciones {
    
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.printf("Usted tiene una notificación SMS: %s", mensaje);
    }

}
