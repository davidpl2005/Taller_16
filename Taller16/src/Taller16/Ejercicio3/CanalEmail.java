package Taller16.Ejercicio3;

public class CanalEmail extends CanalMensaje {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo electronico: " + mensaje);
    }
}
