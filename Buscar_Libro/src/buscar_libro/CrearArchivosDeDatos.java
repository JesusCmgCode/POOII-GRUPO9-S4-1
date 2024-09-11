
package buscar_libro;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivosDeDatos {
    private static final String RUTA_LIBROS = "src/libros.txt";
    private static final String RUTA_AUTORES = "src/autores.txt";

    public static void main(String[] args) {
        try {
            crearArchivoLibros();
            crearArchivoAutores();
            System.out.println("Archivos creados y llenos exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void crearArchivoLibros() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_LIBROS))) {
            writer.write("978-3-16-148410-0\tEl Gran Libro\tAutor 1\ttrue\tfalse\n");
            writer.write("978-1-61-729453-0\tOtro Libro\tAutor 2\tfalse\ttrue\n");
            writer.write("978-0-13-468599-1\tProgramación en Java\tAutor 3\ttrue\ttrue\n");
            writer.write("978-0-321-35668-0\tDiseño de Patrones\tAutor 4\tfalse\tfalse\n");
            writer.write("978-0-201-63361-0\tAlgoritmos\tAutor 5\ttrue\tfalse\n");
        }
    }

    private static void crearArchivoAutores() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_AUTORES))) {
            writer.write("Autor 1\n");
            writer.write("Autor 2\n");
            writer.write("Autor 3\n");
            writer.write("Autor 4\n");
            writer.write("Autor 5\n");
        }
    }
}
