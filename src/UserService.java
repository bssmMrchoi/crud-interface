import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserService implements CrudService<User>{
  private Map<Long, User> users;
  public UserService() {
    users = new HashMap<>();
  }

  @Override
  public User create(User entity) {
    return users.put(entity.getId(), entity);
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
    return users.remove(id)!=null;
  }

  @Override
  public List<User> listAll() {
    return users.values().stream().toList();
  }
}
