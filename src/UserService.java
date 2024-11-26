import java.time.LocalDateTime;
import java.util.*;

public class UserService implements CrudService<User> {
  private static Long index = 0L;
  private static Map<Long, User> users = new HashMap<>();

  @Override
  public User create(User entity) {
    entity.setCreatedAt(LocalDateTime.now());
    users.put(index++, entity);
    return entity;
  }

  @Override
  public User read(Long id) {
    return users.get(id);
  }

  @Override
  public User update(Long id, User entity) {
    User user = read(id);
    user.setName(entity.getName());
    user.setEmail(entity.getEmail());
    user.setPassword(entity.getPassword());
    return user;
  }

  @Override
  public User delete(Long id) {
    User user = read(id);
    users.remove(id);
    return user;
  }

  @Override
  public List<User> listAll() {
    return users.values().stream().toList();
  }
}
