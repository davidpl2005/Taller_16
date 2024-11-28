package Taller16.Ejercicio3;

public class GestorMensajes {
    public void enviarMensaje(CanalMensaje canal, String mensaje) {
        canal.enviar(mensaje);
    }
}
