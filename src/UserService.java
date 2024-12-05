import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class UserService implements CrudService<User> {
    private Map<Long, User> userMap = new HashMap<>();

    @Override
    public User create(User user) {
        return userMap.put(user.getId(), user);
    }

    @Override
    public User read(Long id) {
        return userMap.get(id);
    }

    @Override
    public User update(Long id, User user) {
        if (userMap.containsKey(id)) {
            userMap.put(id, user);
            return user;
        }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return userMap.remove(id) != null;
    }

    @Override
    public List<User> listAll() {
        return new ArrayList<>(userMap.values());  // List로 반환
    }

    public void printAllUsers() {
        System.out.println(listAll());
    }
}