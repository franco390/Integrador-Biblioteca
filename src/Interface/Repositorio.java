package Interface;

import java.util.List;

public interface Repositorio<T, ID>{

     void guardar (T t);
     T buscarPorId(ID id);
     void eliminar(ID id);
     List<T> listarTodos();
}
