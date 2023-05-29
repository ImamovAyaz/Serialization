import java.io.Serializable;

public class Credantials implements Serializable {
    private String login;
    private String password;

    Credantials(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
