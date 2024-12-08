import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de libros
        Libro libro1 = new Libro("Java para Principiantes", "John Doe", "12345");
        Libro libro2 = new Libro("Programación Avanzada", "Jane Smith", "67890");
        Libro libro3 = new Libro("Fundamentos de Python", "Alice Johnson", "11121");
        Libro libro4 = new Libro("Introducción a C#", "Bob Martin", "11223");
        Libro libro5 = new Libro("Bases de Datos SQL", "Carlos Pérez", "33445");

        // Crear una instancia de la biblioteca y agregar libros al catálogo
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);

        // Crear 5 instancias de usuarios
        Usuario usuario1 = new Usuario("Carlos Perez");
        Usuario usuario2 = new Usuario("Ana Ruiz");
        Usuario usuario3 = new Usuario("Luis Gómez");
        Usuario usuario4 = new Usuario("Marta Sánchez");
        Usuario usuario5 = new Usuario("José Martín");

        // El usuario1 pide prestado el libro1
        usuario1.pedirPrestado(libro1);

        // El usuario2 pide prestado el libro2
        usuario2.pedirPrestado(libro2);

        // El usuario3 pide prestado el libro3
        usuario3.pedirPrestado(libro3);

        // El usuario4 pide prestado el libro4
        usuario4.pedirPrestado(libro4);

        // El usuario5 pide prestado el libro5
        usuario5.pedirPrestado(libro5);

        // Crear 5 instancias de empleados
        Empleado empleado1 = new Empleado("Ana Ruiz");
        Empleado empleado2 = new Empleado("David Torres");
        Empleado empleado3 = new Empleado("Clara López");
        Empleado empleado4 = new Empleado("Raúl Gómez");
        Empleado empleado5 = new Empleado("Elena Fernández");

        // Los empleados gestionan a los usuarios
        empleado1.gestionarUsuario(usuario1);
        empleado2.gestionarUsuario(usuario2);
        empleado3.gestionarUsuario(usuario3);
        empleado4.gestionarUsuario(usuario4);
        empleado5.gestionarUsuario(usuario5);

        // Los empleados gestionan los libros
        empleado1.gestionarLibro(libro1);
        empleado2.gestionarLibro(libro2);
        empleado3.gestionarLibro(libro3);
        empleado4.gestionarLibro(libro4);
        empleado5.gestionarLibro(libro5);

        // Crear 5 instancias de transacciones
        Transaccion transaccion1 = new Transaccion(new Date(), "prestamo");
        Transaccion transaccion2 = new Transaccion(new Date(), "prestamo");
        Transaccion transaccion3 = new Transaccion(new Date(), "prestamo");
        Transaccion transaccion4 = new Transaccion(new Date(), "prestamo");
        Transaccion transaccion5 = new Transaccion(new Date(), "prestamo");

        // Registrar las transacciones
        transaccion1.registrarTransaccion(usuario1, libro1);
        transaccion2.registrarTransaccion(usuario2, libro2);
        transaccion3.registrarTransaccion(usuario3, libro3);
        transaccion4.registrarTransaccion(usuario4, libro4);
        transaccion5.registrarTransaccion(usuario5, libro5);

        // Los usuarios devuelven los libros
        usuario1.devolverLibro(libro1);
        usuario2.devolverLibro(libro2);
        usuario3.devolverLibro(libro3);
        usuario4.devolverLibro(libro4);
        usuario5.devolverLibro(libro5);

        // Los empleados gestionan los libros después de la devolución
        empleado1.gestionarLibro(libro1);
        empleado2.gestionarLibro(libro2);
        empleado3.gestionarLibro(libro3);
        empleado4.gestionarLibro(libro4);
        empleado5.gestionarLibro(libro5);
    }
}
