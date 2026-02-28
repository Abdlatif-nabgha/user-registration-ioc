package com.nabgha.registration;

public class User {
    private long id;
    private String email;
    private String password;
    private String user;

    public User(long id, String email, String password, String user) {
        this.user = user;
        this.email = email;
        this.id = id;
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

    public String getUser() {
        return user;
    }

    public void setUser(String User) {
        this.user = User;
    }

    @Override
    public String toString() {
        return "[id: " + id +
                ", email: " + email +
                ", password: " + password +
                ", user: " + user + "]";
    }


}
