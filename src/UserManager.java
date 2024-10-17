public class UserManager {
    public static void showAllUsers() {
        System.out.println("List of Users:");

        for (User user : User.userList) {
            System.out.println("Name: " + user.getUsername());
            System.out.println("Password: " + user.getPassword());
            System.out.println("---------------------");
        }
    }
}
