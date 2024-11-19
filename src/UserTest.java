import javax.sound.midi.Soundbank;

public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = new UserService();

        // C
        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));
        System.out.println(user1);
        System.out.println(user2);

        // R
        System.out.println("\n id = 2인 user Read");
        User find = userService.read(2L);
        System.out.println(find);

        // U
        User updateUser = userService.update(1L, new User("park", "park@bssm.hs.kr", "q1w2e3"));
        System.out.println("\n" + updateUser);

        // D
        System.out.println("\n" + userService.delete(1L));


        User find1 = userService.read(1L);
        System.out.println(find1 + "\n");

        // List All -> 전부 다
        userService.listAll().forEach(System.out::println);
    }
}
