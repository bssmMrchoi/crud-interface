public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = new UserService();

        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));

        System.out.println(userService.read(0L));

        User user3 = new User("ZIP", "gagosipda@gmail.com", "ambitiously");
        System.out.println();
        userService.update(0L, user3);
        System.out.println(userService.read(0L));
        System.out.println();
        userService.listAll().forEach(System.out::println);
        System.out.println();
        userService.delete(1L);
        userService.listAll().forEach(System.out::println);
    }
}
