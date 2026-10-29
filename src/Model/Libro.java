package Model;

public class Libro extends Publicacion{

    private int isbn;
    private String autor;
    private int numPaginas;

    public Libro(String id, String titulo, int anio, boolean disponible, int isbn, String autor, int numPaginas) {
        super(id, titulo, anio, disponible);
        this.isbn = isbn;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + "Libro{" +
                "isbn=" + isbn +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
