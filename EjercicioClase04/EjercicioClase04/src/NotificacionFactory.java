public class NotificacionFactory {
    
    public static Notificaciones getNotificacion(Enumtipomensaje enumtipomensaje){
        switch(enumtipomensaje){
            case CORREO:
                // Devuelve una instancia de Correo, que implementa Notificaciones
                return new Correo();
            case PUSH:
                // Devuelve una instancia de Push, que implementa Notificaciones
                return new Push();
            case SMS:
                // Devuelve una instancia de Sms, que implementa Notificaciones
                return new Sms();
            default:
                throw new IllegalArgumentException("Tipo de mensaje inválido");
        }
    }
}
