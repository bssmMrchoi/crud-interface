public class UserTest {
    public static void main(String[] args) {
        CrudService<User> userService = new UserService();

        User user1 = userService.create(new User("choi", "choi@bssm.hs.kr", "q1w2e3"));
        User user2 = userService.create(new User("kim", "kim@bssm.hs.kr", "1q2w3e"));

        System.out.println(user1);
        System.out.println(user2);

        userService.create(new User("nono","soi@alkdf.caoi","daskfl"));

        User s = userService.read(1L);
        System.out.println(s);
        userService.update(2L,new User("sadfl","sdlkafj","sdakfj"));
        System.out.println((userService.delete(1L)));
        System.out.println(userService.listAll());
    }
}
