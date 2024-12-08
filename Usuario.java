import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Libro> listaLibros = new ArrayList<>();

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    // Métodos
    public void pedirPrestado(Libro libro) {
        listaLibros.add(libro);
        libro.prestar();
    }

    public void devolverLibro(Libro libro) {
        if (listaLibros.contains(libro)) {
            listaLibros.remove(libro);
            libro.devolver();
        } else {
            System.out.println("Este libro no estaba prestado por el usuario.");
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }
}
