
package buscar_libro;

import java.io.*;
import java.util.*;
import javax.swing.JComboBox;

public class LibroManager {
    private static final String ARCHIVO_LIBROS = "/libros.txt";
    private static final String ARCHIVO_AUTORES = "/autores.txt";

    // Método para obtener la ruta del archivo desde el classpath
    private InputStream obtenerArchivo(String nombreArchivo) {
        return getClass().getResourceAsStream(nombreArchivo);
    }

    // Método para buscar libro por ISBN
    public Libro buscarLibro(String isbn) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(obtenerArchivo(ARCHIVO_LIBROS)))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\t");
                if (datos.length == 5 && datos[0].equals(isbn)) {
                    return new Libro(datos[0], datos[1], datos[2], Boolean.parseBoolean(datos[3]), Boolean.parseBoolean(datos[4]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Método para cargar autores en el JComboBox
    public void cargarAutores(JComboBox<String> comboBox) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(obtenerArchivo(ARCHIVO_AUTORES)))) {
            String autor;
            while ((autor = br.readLine()) != null) {
                if (!autor.trim().isEmpty()) {
                    comboBox.addItem(autor.trim());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
