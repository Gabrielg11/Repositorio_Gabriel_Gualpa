import java.util.Date;

public class Transaccion {
    private Date fecha;
    private String tipo;  // "prestamo" o "devolucion"

    // Constructor
    public Transaccion(Date fecha, String tipo) {
        this.fecha = fecha;
        this.tipo = tipo;
    }

    // Método para registrar la transacción
    public void registrarTransaccion(Usuario usuario, Libro libro) {
        System.out.println("Transacción registrada: " + tipo + " - Usuario: " + usuario.getNombre() + ", Libro: " + libro.getTitulo());
    }

    // Getters
    public Date getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }
}
