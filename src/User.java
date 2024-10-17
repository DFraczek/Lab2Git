import java.util.ArrayList;

public class User {
    private String username;
    private String passwd;

    public static ArrayList<User> userList = new ArrayList<>();
    public User(String username, String passwd) {
        this.setUsername(username);
        this.setPassword(passwd);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username != null && username.length() >= 3) {
            this.username = username;
        } else {
            throw new IllegalArgumentException("Username must be at least 3 characters long.");
        }
    }

    public String getPassword() {
        return passwd;
    }

    public void setPassword(String passwd) {
        if (passwd != null && passwd.length() >= 8) {
            this.passwd = passwd;
        } else {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }
    }
    public static User register(String username, String passwd) {
        try {
            User newUser = new User(username, passwd);
            userList.add(newUser);
            return newUser;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
