import java.util.Scanner;

public class Login {

    public static void loginUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj nazwę użytkownika: ");
        String username = scanner.nextLine();

        System.out.print("Podaj hasło: ");
        String password = scanner.nextLine();

        boolean loginSuccessful = false;
        for (User user : User.userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loginSuccessful = true;
                break;
            }
        }

        if (loginSuccessful) {
            System.out.println("Logowanie zakończone sukcesem!");
        } else {
            System.out.println("Niepoprawna nazwa użytkownika lub hasło.");
        }
    }
}
