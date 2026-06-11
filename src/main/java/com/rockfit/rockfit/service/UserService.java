package com.rockfit.rockfit.service;

import com.rockfit.rockfit.entity.User;
import com.rockfit.rockfit.repository.UserRepository;
import org.springframework.stereotype.Service;

    @Service
    public class UserService {

        private final UserRepository userRepository;

        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository;
        }

        public User saveUser(User user) {
            return userRepository.save(user);
        }
    }

