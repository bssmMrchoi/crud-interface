public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = new UserService();

        //C
        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));
        System.out.println(user1);
        System.out.println(user2);

        //R
        System.out.println("\n id = 2인 user Read 할거");
        User find = userService.read(2L);
        System.out.println(find);

        //U
        User updateUser = userService.update(1L, new User("park", "park@email", "q1w2e3"));
        System.out.println("\n"+updateUser);

        //D
        System.out.println(userService.delete(1L));
        System.out.println(userService.read(1L));

        // HashMapAll -> 다 보여주셈
        userService.ListAll().forEach(System.out::println);
    }
}