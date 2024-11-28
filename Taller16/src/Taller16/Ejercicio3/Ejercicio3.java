package Taller16.Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        String mensaje = "Este es el mensaje de prueba";

        CanalMensaje canalEmail = new CanalEmail();
        CanalMensaje canalSMS = new CanalSMS();
        CanalMensaje canalPush = new CanalPush();

        GestorMensajes gestor = new GestorMensajes();

        gestor.enviarMensaje(canalEmail, mensaje);
        gestor.enviarMensaje(canalSMS, mensaje);
        gestor.enviarMensaje(canalPush, mensaje);
    }
}

