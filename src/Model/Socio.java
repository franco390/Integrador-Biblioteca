package Model;

public class Socio {

    private String id;
    private String nombre;
    private String email;
    private String fechaAlta;

    public Socio(String id, String nombre, String fechaAlta, String email) {
        this.id = id;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
        this.email = email;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", fechaAlta='" + fechaAlta + '\'' +
                '}';
    }
}
