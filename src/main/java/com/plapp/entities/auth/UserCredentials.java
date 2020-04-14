package com.plapp.entities.auth;


public class UserCredentials {
    private long id;

    private String email;

    private String password;

    public UserCredentials() {

    }

    public UserCredentials(long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return String.format("{ id: %d, email: %s, password: %s}", id, email, password);
    }
}

