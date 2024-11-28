package Taller16.Ejercicio1;

public class DescuentoFijo extends Descuento {
    private double montoFijo;

    public DescuentoFijo(double montoFijo) {
        this.montoFijo = montoFijo;
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - montoFijo;
    }
}
