
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService implements CrudService<User>{
  private Map<Long, User> users;
  public UserService() {
    this.users = new HashMap<Long, User>();
  }
  @Override
  public User create(User entity) {
    users.put(entity.getId(),entity);
    return entity;
  }

  @Override
  public User read(Long id) {
    return users.get(id);
  }

  @Override
  public User update(Long id, User entity) {
    users.put(id, entity);
    return entity;
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
