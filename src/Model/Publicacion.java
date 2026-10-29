package Model;

public abstract class Publicacion {

    private String id;
    private String titulo;
    private int anio;
    private boolean disponible;

    public Publicacion(String id, String titulo, int anio, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.anio = anio;
        this.disponible = disponible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", disponible=" + disponible +
                '}';
    }


}
