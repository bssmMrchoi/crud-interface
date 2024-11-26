import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService implements CrudService<User> {
  private Map<Long, User> users = new HashMap<>();
  private long nextId = 1L;


  @Override
  public User create(User entity){
    entity.setId(nextId);
    users.put(nextId,entity);
    nextId++;
    return entity;
  }

  @Override
  public User read(Long id){
    return users.get(id);
  }

  @Override
  public User update(Long id,User entity){
    return users.put(entity.getId(), entity);
  }

  @Override
  public boolean delete(Long id){
    return users.remove(id) != null;
  }

  @Override
  public List<User> listAll() {
    List <User> result = new ArrayList<>();
    result.addAll(users.values());
    return new ArrayList<>(result);
  }

}
