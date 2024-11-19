import java.util.List;

public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = new UserService();

        //Create
        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));
        System.out.println(user1);
        System.out.println(user2);

        //Read
        System.out.println("\nid = 2인 user Read 할 거임 ㅅㄱ");
        User find = userService.read(2L);
        System.out.println(find);

        //Update
        System.out.println("\nUpdate");
        User updateUser = userService.update(1L, new User("Lee", "Lee@bssm.hs.kr", "q1w2e3"));
        System.out.println(updateUser);

        //Delete
        System.out.println();
        System.out.println(userService.delete(1L));
        System.out.println(userService.read(1L));

        //List All
        System.out.println();
        userService.listAll().forEach(System.out::println);

    }
}
