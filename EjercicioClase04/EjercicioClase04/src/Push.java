public class Push implements Notificaciones {

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.printf("Usted tiene una notificación PUSH: %s", mensaje);
    }
    
}
