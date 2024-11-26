import java.util.HashMap;  // HashMap import
import java.util.Map;     // Map import

public class UserService implements CrudService<User> {
    private Map<Long, User> userMap = new HashMap<>();  // Map과 HashMap 사용

    @Override
    public void create(User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public User read(Long id) {
        return userMap.get(id);
    }

    @Override
    public void update(Long id, User user) {
        if (userMap.containsKey(id)) {
            userMap.put(id, user);
        }
    }

    @Override
    public void delete(Long id) {
        userMap.remove(id);
    }

    @Override
    public void listAll() {
        if (userMap.isEmpty()) {
            System.out.println("No users available.");
        } else {
            for (User user : userMap.values()) {
                System.out.println(user);
            }
        }
    }

    public void printAllUsers() {
        listAll();  // listAll 메서드를 호출하여 사용자 목록을 출력
    }
}