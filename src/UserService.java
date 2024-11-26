import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService implements CrudService<User> {
  private Map<Long, User> users = new HashMap<>();
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
    return users.put(id, entity);
  }

  @Override
  public boolean delete(Long id) {
    return users.remove(id) != null;
  }

  @Override
  public List<User> ListAll() {
    return users.values().stream().toList();
  }
}

