import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService implements CrudService <User>{
  private List<User> users = new ArrayList<User>();

  private Long nextId = 1L;


  @Override
  public User create(User entity) {
    entity.setId(nextId++);
    users.add(entity);
    return entity;
  }

  @Override
  public User read(Long id) {
    users.stream()
            .filter(user -> user.getId().equals(id))
            .findFirst()
            .orElse(null);
    return users.get(0);
  }

  @Override
  public User update(Long id, User entity) {
    Optional<User> findUser = users.stream()
            .filter(user -> user.getId().equals(id))
            .findFirst();

    if(findUser.isPresent()) {
      User user = findUser.get();
      user.setName(entity.getName());
    }

    return users.get(0);
  }

  @Override
  public boolean delete(Long id) {
    return users.removeIf(user -> user.getId().equals(id));
  }

  @Override
  public List<User> listAll() {
    return new ArrayList<>(users);
  }
}
