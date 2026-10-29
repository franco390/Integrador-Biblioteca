package Model;

public class Revista extends Publicacion{

    private int issn;
    private int numero;
    private String periodicidad;

    public Revista(String id, String titulo, int anio, boolean disponible, int issn, String periodicidad, int numero) {
        super(id, titulo, anio, disponible);
        this.issn = issn;
        this.periodicidad = periodicidad;
        this.numero = numero;
    }

    public int getIssn() {
        return issn;
    }

    public void setIssn(int issn) {
        this.issn = issn;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Revista{" +
                "issn=" + issn +
                ", numero=" + numero +
                ", periodicidad='" + periodicidad + '\'' +
                '}';
    }
}
