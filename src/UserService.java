import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class UserService implements CrudService<User> {

  private Map<Long, User> users = new HashMap<>();
  private Long nextId = 1L;

  @Override
  public User create(User entity) {
    entity.setId(nextId);
    users.put(nextId, entity);
    nextId++;
    return null;
  }

  @Override
  public User read(Long id) {
    return users.get(id);
  }

  @Override
  public User update(Long id, User entity) {
    User optionalUser = users.get(id);

    if (optionalUser != null) {
      User updatedUser = optionalUser;
      updatedUser.setId(id);
      updatedUser.setName(entity.getName());
      updatedUser.setEmail(entity.getEmail());
      updatedUser.setPassword(entity.getPassword());
      users.put(id, updatedUser);
      return updatedUser;
    }
    return null;
  }

  @Override
  public boolean delete(Long id) {
    return users.remove(id) != null;
  }

  @Override
  public List<User> listAll() {
    return List.of();
  }
}
