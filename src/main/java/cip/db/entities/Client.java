package cip.db.entities;

import cip.db.annotation.Entity;
import org.springframework.data.annotation.Id;


@Entity
public class Client {
    @Id
    private String login;

    private String name;

    public Client(String login, String name) {
        this.login = login;
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
