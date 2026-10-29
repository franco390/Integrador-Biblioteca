package Repositorio;

import Interface.Repositorio;
import Model.Prestamo;
import Model.Socio;

import java.util.HashMap;
import java.util.List;

public class RepositorioSocio implements Repositorio<Socio, Integer> {

    private HashMap<Integer, List<Prestamo>> mapaSocio;

    public RepositorioSocio() {
        this.mapaSocio = new HashMap<>();
    }

    @Override
    public void guardar(Socio socio) {

    }

    @Override
    public Socio buscarPorId(Integer integer) {
        return null;
    }

    @Override
    public void eliminar(Integer integer) {

    }

    @Override
    public List<Socio> listarTodos() {
        return List.of();
    }
}
