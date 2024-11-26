public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = new UserService();
        User user1 = userService.create(new User("park", "park@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("mandong", "kim@bssm.hs.kr", "1q2w3e"));
    }
}
