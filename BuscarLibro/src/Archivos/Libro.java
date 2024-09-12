
package Archivos;


public class Libro {
    
    private String isbn;
    private String titulo;
    private String autor;
    private boolean leido;
    private boolean loTengo;

    // Constructor metodo
    public Libro(String isbn, String titulo, String autor, boolean leido, boolean loTengo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.leido = leido;
        this.loTengo = loTengo;
    }

    // Getters
    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isLeido() { return leido; }
    public boolean isLoTengo() { return loTengo; }

 
    }


