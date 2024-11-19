import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserService implements CrudService<User>{
  private List<User> users = new ArrayList<>(); //DB
  private Long nextId = 1L;

  @Override
  public User create(User entity) {
    entity.setId(nextId++);
    users.add(entity);
    return entity;
  }

  @Override
  public User read(Long id) {
    return users.stream()
            .filter(user -> user.getId().equals(id))
            .findFirst()
            .orElse(null);
  }

  @Override
  public User update(Long id, User entity) {
    Optional<User> findUser = users.stream()
                                    .filter(user -> user.getId().equals(id))
                                    .findFirst();
    if (findUser.isPresent()) { //안에 존재한다면 findUser을 벗고 옵션만 나타남
      User user = findUser.get(); //users에 있는 주소를 넘김
      user.setName(entity.getName());
      user.setEmail(entity.getEmail());
      user.setPassword(entity.getPassword());
      return user;
    }
    return null;
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
