import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService implements CrudService<User> {
  private Map<Long, User> userMap = new HashMap<>();
  private long currentId = 1;

  @Override
  public User create(User user) {
    userMap.put(currentId, user);
    currentId++;
    return user;
  }

  @Override
  public User read(Long id) {
    return userMap.get(id);
  }

  @Override
  public User update(Long id, User updatedUser) {
    if (userMap.containsKey(id)) {
      userMap.put(id, updatedUser);
      return updatedUser;
    }
    return null;
  }

  @Override
  public boolean delete(Long id) {
    if (userMap.containsKey(id)) {
      userMap.remove(id);
      return true;
    }
    return false;
  }

  @Override
  public List<User> listAll() {
    return userMap.values().stream().toList();
  }
}
