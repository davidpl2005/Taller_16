package Taller16.Ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        String contenido = "Este es el contenido del documento.";

        Documento documentoPDF = new DocumentoPDF();
        Documento documentoWord = new DocumentoWord();
        Documento documentoExcel = new DocumentoExcel();

        GestorDocumento gestorDocumento = new GestorDocumento();

        gestorDocumento.exportarDocumento(documentoPDF, contenido);
        gestorDocumento.exportarDocumento(documentoWord, contenido);
        gestorDocumento.exportarDocumento(documentoExcel, contenido);
    }
}
