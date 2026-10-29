package Exception;

public class LibroNoDisponibleException extends BibliotecaException {
    public LibroNoDisponibleException() {
        super("El libro no fue encontrado.");
    }
}
