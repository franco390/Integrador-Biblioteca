package Repositorio;

import Interface.Repositorio;
import Model.Prestamo;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class RepositorioPrestamo implements Repositorio<Prestamo, Integer> {

    private Queue<Prestamo> pilaPrestamo;

    public RepositorioPrestamo() {
        this.pilaPrestamo = new ArrayDeque<>() {
        };
    }

    @Override
    public void guardar(Prestamo prestamo) {

    }

    @Override
    public Prestamo buscarPorId(Integer integer) {
        return null;
    }

    @Override
    public void eliminar(Integer integer) {

    }

    @Override
    public List<Prestamo> listarTodos() {
        return List.of();
    }
}
