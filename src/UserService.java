import java.util.*;

public class UserService implements CrudService<User> {
  Map<Long, User> users = new HashMap<>();
  private Long nextId = 1L;

  @Override
  public User create(User entity) {
    entity.setId(nextId++);
    users.put(entity.getId(), entity);
    return entity;
  }

  @Override
  public User read(Long id) {
    return users.get(id);
  }

  @Override
  public User update(Long id, User entity) {
    if (users.containsKey(id)) {
      entity.setId(id);
      users.put(id, entity);
      return entity;
    }
    return null;
  }

  @Override
  public boolean delete(Long id) {
    return users.remove(id) != null;
  }

  @Override
  public List<User> listAll() {
    return new ArrayList<>(users.values());
  }
}
