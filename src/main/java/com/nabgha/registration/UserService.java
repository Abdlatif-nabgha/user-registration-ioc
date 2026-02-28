package com.nabgha.registration;

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
