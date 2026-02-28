package com.nabgha.registration;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;
    NotificationService notificationService;

    public UserService(NotificationService notificationService, UserRepository userRepository) {
        this.notificationService = notificationService;
        this.userRepository = userRepository;
    }


    public void registerUser(User user) {
        userRepository.save(user);
        notificationService.send("message", user.getEmail());
    }
}
