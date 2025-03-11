public class Main {
    public static void main(String[] args) throws Exception {

        Notificaciones correo = NotificacionFactory.getNotificacion(Enumtipomensaje.CORREO);
        correo.enviarMensaje("Tiene algunas deudas pendientes");
        
    }
}
