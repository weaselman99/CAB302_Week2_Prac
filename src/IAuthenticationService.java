import java.util.ArrayList;

public interface IAuthenticationService {
    User signUp(String username, String password);
    User logIn(String username, String password);
}

public class AuthenticationService implements IAuthenticationService {
    private ArrayList<User> users;

    // TODO Now: Add a constructor to initialize the users list with the default user
    public AuthenticationService(ArrayList<User> users) {
        this.users = users;
    }

    // TODO Now: Implement the signUp method to add a new user to the list if the username is not taken and return the user; returns null otherwise
    public User signUp(String username, String password) {
        User user = new User(username, password);
        this.users.add(user);
        return user;
    }
    // TODO Now: Implement the logIn method to return the user if the username and password match, and null otherwise
    public User logIn(String username, String password) {
        for (User user : this.users) {
            if ((match.getUsername()) == password && (match.getPassword() == password) {
                return match;
            }
        }
        return null;
    }
}
