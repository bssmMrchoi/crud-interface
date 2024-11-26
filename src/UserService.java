import javax.print.attribute.HashPrintJobAttributeSet;
import java.util.*;

public class UserService implements CrudService<User>{
  private Map<Long, User> userMap = new HashMap<>();
  private Long nextId = 1L;

  @Override
  public User create(User entity) {
    entity.setId(nextId++);
    userMap.put(nextId, entity);
    return entity;
  }

  @Override
  public User read(Long id) {
    return userMap.get(id);
  }

  @Override
  public User update(Long id, User entity) {
    return userMap.put(id, entity);
  }

  @Override
  public boolean delete(Long id) {
    return userMap.remove(id) != null;
  }

  @Override
  public List<User> listAll() {
    return userMap.values().stream().toList();
  }
}