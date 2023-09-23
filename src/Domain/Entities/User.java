package Domain.Entities;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private boolean isAuth;

    public User(String name){
        this.setName(name);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAuth() {
        return isAuth;
    }

    public void setAuth(boolean auth) {
        isAuth = auth;
    }
}
