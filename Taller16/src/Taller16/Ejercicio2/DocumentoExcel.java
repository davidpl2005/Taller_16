package Taller16.Ejercicio2;

public class DocumentoExcel extends Documento {
    @Override
    public void exportar(String contenido) {
        System.out.println("Exportando contenido a Excel: " + contenido);
    }
}
