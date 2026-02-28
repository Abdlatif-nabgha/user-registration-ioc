package com.nabgha.registration;

public interface  UserRepository {
    void save(User user);
    User findByEmail(String email);
}
