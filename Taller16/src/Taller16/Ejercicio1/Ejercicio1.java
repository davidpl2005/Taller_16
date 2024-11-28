package Taller16.Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        double precioOriginal = 100.0;

        Descuento descuentoPorcentaje = new DescuentoPorcentaje(20);
        Descuento descuentoFijo = new DescuentoFijo(15);
        GestorDescuento gestorDescuento = new GestorDescuento();

        double precioConDescuentoPorcentaje = gestorDescuento.aplicarDescuento(descuentoPorcentaje, precioOriginal);
        System.out.println("Precio con descuento porcentual: " + precioConDescuentoPorcentaje);

        double precioConDescuentoFijo = gestorDescuento.aplicarDescuento(descuentoFijo, precioOriginal);
        System.out.println("Precio con descuento fijo: " + precioConDescuentoFijo);
    }
}
