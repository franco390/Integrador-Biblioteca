package Exception;

public class BibliotecaException extends Exception {

    public BibliotecaException(){ super("Ocurrio un error."); }
    public BibliotecaException(String message) {
        super(message);
    }
}
