package Biblioteca;

public class Autor {
    private String nombre;

    // cons
    public Autor(String nombre) {
        this.nombre = nombre;
    }

    // getyset
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
