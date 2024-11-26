public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = (CrudService<User>) new UserService();
        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));
        //C
        System.out.println(user1);
        System.out.println(user2);

        //R
        System.out.println("\n id = 2인 user Read 할거임");
        User find = userService.read(2L);
        System.out.println(find);

        //U
        User updateUser = userService.update(1L,new User("minjae@bssm.hs.kr","minjae","q1w2e4"));
        System.out.println("\n"+updateUser);

        //D
        System.out.println(userService.delete(1L));
        User find1 = userService.read(1L);
        System.out.println(find1);

        //List All
        userService.listAll().forEach(System.out::println);
    }
}
