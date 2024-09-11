
package buscar_libro;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private boolean leido;
    private boolean loTengo;

    // Constructor
    public Libro(String isbn, String titulo, String autor, boolean leido, boolean loTengo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.leido = leido;
        this.loTengo = loTengo;
    }

    Libro(String parte, String parte0, String parte1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isLeido() { return leido; }
    public boolean isLoTengo() { return loTengo; }

    // Método para mostrar los datos del libro en formato tabla
    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t%s\t%s", isbn, titulo, leido ? "Sí" : "No", loTengo ? "Sí" : "No", autor);
    }
}

