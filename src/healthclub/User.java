package healthclub;

// User.java
public class User {
   // private int userId;
    private String username;
    private String password;

    public User(int userId, String username, String password) {
      //  this.userId = userId;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return  "username='" + username + ", password='" + password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void login() {
        // Implementation for login
    }

    public void logout() {
        // Implementation for logout
    }

    public void updateInformation() {
        // Implementation for updating information
    }
}
