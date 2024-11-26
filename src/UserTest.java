public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = new UserService();
        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));
        User foundUser = userService.read(1L);
        System.out.println(foundUser);
        userService.update(1L, new User("choi", "choi_updated@bssm.hs.kr", "newpassword"));
        System.out.println(userService.read(1L));
        System.out.println( userService.listAll());
        userService.delete(1L);
//        for (User user : userService.listAll()) {
//            System.out.println(user);
//        }
    }
}
