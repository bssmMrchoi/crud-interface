import java.awt.print.Printable;

public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = new UserService();

        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));
        User updateUser = userService.update(1L,new User("name","email","password"));
//        if(userService.delete(1L)){
//            System.out.println("delete success");
//        }
        userService.listAll().forEach(System.out::println);
    }
}
