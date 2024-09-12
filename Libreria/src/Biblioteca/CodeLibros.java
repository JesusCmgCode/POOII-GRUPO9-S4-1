package Biblioteca;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CodeLibros {
    private static final String ARCHIVO_LIBROS = "LibrosAutores.txt";

    //Guardar libro en el archivo :D
    public static void guardarLibro(Libro libro) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_LIBROS, true))) {
            bw.write(libro.toString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Cargar libros desd eel archivo (funca)
    public static List<Libro> cargarLibros() {
        List<Libro> libros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_LIBROS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 6) {
                    String isbn = datos[0];
                    String titulo = datos[1];
                    String autor = datos[2];
                    String sinopsis = datos[3];
                    String genero = datos[4];
                    String estado = datos[5];
                    Libro libro = new Libro(isbn, titulo, autor, sinopsis, genero, estado);
                    libros.add(libro);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return libros;
    }

    // Metodo para buscar libro 
    public static Libro buscarLibro(String isbn) {
        List<Libro> libros = cargarLibros();
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null; 
    }
}
