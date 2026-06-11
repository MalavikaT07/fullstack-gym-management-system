package com.rockfit.rockfit.controller;

import com.rockfit.rockfit.entity.User;
import com.rockfit.rockfit.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class TestController {

        private final UserRepository userRepository;

        public TestController(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        @GetMapping("/test")
        public String test() {

            User user = new User();
            user.setName("Admin");
            user.setEmail("admin@rockfit.com");

            userRepository.save(user);

            return "Saved Successfully";
        }
    }

