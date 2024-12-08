public class Empleado {
    private String nombre;

    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Métodos
    public void gestionarUsuario(Usuario usuario) {
        System.out.println("Empleado " + nombre + " está gestionando al usuario " + usuario.getNombre());
    }

    public void gestionarLibro(Libro libro) {
        System.out.println("Empleado " + nombre + " está gestionando el libro '" + libro.getTitulo() + "'");
    }

    // Getter
    public String getNombre() {
        return nombre;
    }
}
