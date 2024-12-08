public class Libro {
    private String titulo;
    private String autor;
    private String isbn;

    // Constructor
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Métodos
    public void prestar() {
        System.out.println("El libro '" + titulo + "' ha sido prestado.");
    }

    public void devolver() {
        System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }
}
