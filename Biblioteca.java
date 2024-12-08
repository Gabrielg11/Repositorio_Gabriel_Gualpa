import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> catalogoLibros = new ArrayList<>();

    // Métodos
    public void agregarLibro(Libro libro) {
        catalogoLibros.add(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido agregado al catálogo.");
    }

    public void eliminarLibro(Libro libro) {
        catalogoLibros.remove(libro);
        System.out.println("El libro '" + libro.getTitulo() + "' ha sido eliminado del catálogo.");
    }

    // Getters
    public List<Libro> getCatalogoLibros() {
        return catalogoLibros;
    }
}
