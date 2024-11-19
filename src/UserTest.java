public class UserTest {

    public static void main(String[] args) {
        CrudService<User> userService = new UserService();
        //CREAT
        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));

        System.out.println(user1);
        System.out.println(user2);

        //READ
        System.out.println("\nid = 2 --> READ");
        User find = userService.read(2L);
        System.out.println(find);

        //UPDATE
        User upateUser = userService.update(1L, new User("Sim", "q1q1q1", "simsim@gmail.com"));
        System.out.println("\n" + upateUser);

        //DELETE
        System.out.println(userService.delete(1L));
        User find1 = userService.read(1L);
        System.out.println(find1);

        //List all
        userService.listAll().forEach(System.out::println);

    }
}
