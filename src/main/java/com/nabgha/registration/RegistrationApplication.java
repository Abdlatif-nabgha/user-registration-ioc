package com.nabgha.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RegistrationApplication {

    public static void main(String[] args) {
        ApplicationContext context =
        SpringApplication.run(RegistrationApplication.class, args);
        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L, "nabgha@dev.com", "44026676", "nabgha"));
        userService.registerUser(new User(2L, "abdlatif@ai.com", "44026676", "abdlatif"));
    }

}
