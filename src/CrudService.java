import java.util.List;

public interface CrudService<T> {
    T create(T entity);
    T read(Long id);
    T update(Long id, T entity);
    boolean delete(Long id);
    List<T> listAll();
}
