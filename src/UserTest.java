public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = new UserService();

        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));
        System.out.println(userService.read(2L));
        userService.delete(2L);
        System.out.println(userService.read(2L));
        userService.update(1L,new User("user1","user1@bssm.hs.kr","q1w2e3"));
        System.out.println(userService.read(1L));
        System.out.println(userService.listAll());
    }
}
