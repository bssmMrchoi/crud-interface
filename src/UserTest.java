public class UserTest {
    public static void main(String[] args) {
        UserService userService = new UserService();

        // 사용자 추가
        userService.create(new User(1L, "조하민", "hamin@example.com", "password123", "2023-11-01"));
        userService.create(new User(2L, "조아라", "alike@example.com", "password456", "2023-11-02"));

        // 모든 사용자 출력
        System.out.println("모든 유저:");
        userService.printAllUsers();  // printAllUsers 메서드 호출

        // 사용자 조회
        System.out.println("\n유저 ID 1: " + userService.read(1L));

        // 사용자 수정
        User updatedUser = new User(1L, "심현진", "lonely@example.com", "newpassword123", "2023-11-01");
        userService.update(1L, updatedUser);

        // 수정된 사용자 출력
        System.out.println("\n업데이트 ID 1: " + userService.read(1L));

        // 사용자 삭제
        userService.delete(2L);

        // 삭제 후 사용자 출력
        System.out.println("\n모든 유저 After Delete :");
        userService.printAllUsers();  // printAllUsers 메서드 호출
    }
}