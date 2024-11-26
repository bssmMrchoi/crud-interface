public interface CrudService<T> {
    void create(T t);
    T read(Long id);
    void update(Long id, T t);
    void delete(Long id);  // 반환 타입을 void로 수정
    void listAll();
}