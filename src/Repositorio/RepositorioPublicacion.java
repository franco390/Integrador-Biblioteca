package Repositorio;

import Interface.Repositorio;
import Model.Publicacion;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepositorioPublicacion implements Repositorio<Publicacion, Integer> {

    private Set<Publicacion> setPublicaciones;

    public RepositorioPublicacion() {
        this.setPublicaciones = new HashSet<>();
    }

    @Override
    public void guardar(Publicacion publicacion) {

    }

    @Override
    public Publicacion buscarPorId(Integer integer) {
        return null;
    }

    @Override
    public void eliminar(Integer integer) {

    }

    @Override
    public List<Publicacion> listarTodos() {
        return List.of();
    }
}
