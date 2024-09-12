package Biblioteca;
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String sinopsis;
    private String genero;
    private String estado; 
    
    // Ccnstruc inicial (bien)
    public Libro(String isbn, String titulo, String autor, String sinopsis, String genero, String estado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.sinopsis = sinopsis;
        this.genero = genero;
        this.estado = estado;
    }

    //get y set corrects
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //Metoddo para guardar los datos del libro como texto en el txt (funca :D)
    @Override
    public String toString() {
        return isbn + "," + titulo + "," + autor + "," + sinopsis + "," + genero + "," + estado;
    }
}
