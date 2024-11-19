import javax.xml.transform.Source;
import java.awt.*;
import java.sql.SQLOutput;

public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = new UserService();

        //C(create)
        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));
        System.out.println(user1);
        System.out.println(user2);
        //R(read)
        System.out.println("\nid = 2 인 유저 Read");
        User find = userService.read(2L);
        System.out.println(find);
        //U(update)
        System.out.println("\nid = 1 인 유저 Update");
        User updateUser = userService.update(1L,new User("park","park@bssm.hs.kr", "q1w2e3"));
        System.out.println(updateUser);
        //D
        System.out.println(userService.delete(1L));
        System.out.println("\nid = 1 인 유저 Delete 후 Read");
        User find2 = userService.read(1L);
        System.out.println(find2);

        //ListAll
        System.out.println("\n모든 유저");
        userService.listAll().forEach(System.out::println);

    }
}
