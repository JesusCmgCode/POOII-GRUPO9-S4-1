package Archivos;

import java.io.*;
import java.util.*;
import javax.swing.JComboBox;

public class LibroManager {
    private static final String ARCHIVO_LIBROS = "src/libros.txt"; //ruta libros
    
    private static final String ARCHIVO_AUTORES = "src/autores.txt"; //ruta autores

    // Método para buscar libros por ISBN, Título o Autor
    public List<Libro> buscarLibros(String isbn, String titulo, String autor) {
        List<Libro> resultados = new ArrayList<>(); //Arreglo para crear una list vacía y almacenar los libros
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_LIBROS))) { //bufferedreader para leer archivo linea por linea
            String linea;                                                              //File reader para abrir libros.txt  
           
            while ((linea = br.readLine()) != null) { //va a leer cada archivo hasta el final
                
                String[] datos = linea.split(";"); //separar 
                
                if (datos.length == 5) { //aseguramos los datos
                    
                    boolean coincide = true;
                    // Si al menos una comparación no coincide, coincide se marcará como false, y el libro no se añadirá a la lista de resultados.
                    
                    if (!isbn.isEmpty() && !datos[0].trim().equals(isbn.trim())) coincide = false; //Isbn vacio?
                    
                    if (!titulo.isEmpty() && !datos[1].trim().equalsIgnoreCase(titulo.trim())) coincide = false;// titulo vacio?
                    
                    if (autor != null && !autor.trim().isEmpty() && !datos[2].trim().equalsIgnoreCase(autor.trim())) coincide = false; //autor?

                    if (coincide) {
                        resultados.add(new Libro(datos[0], datos[1], datos[2], Boolean.parseBoolean(datos[3]), Boolean.parseBoolean(datos[4])));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultados;
    }

    // Método para cargar autores en el JComboBox
    
    public void cargarAutores(JComboBox<String> comboBox) {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_AUTORES))) { //abre archivo autores
            String autor;
            
            while ((autor = br.readLine()) != null) { //leer archivo pero hasta que acaben las lineas
                if (!autor.trim().isEmpty()) { //verificacion si esta vacio
                    comboBox.addItem(autor.trim());//añadir al combobox
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
