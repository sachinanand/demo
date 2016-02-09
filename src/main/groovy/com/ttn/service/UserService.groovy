package com.ttn.service

import com.ttn.domain.User
import com.ttn.repository.UserRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

import javax.inject.Inject

/**
 * Created by sachin on 09/02/16.
 */
@Service
class UserService {

    private final Logger log = LoggerFactory.getLogger(UserService.class);

    @Inject
    private UserRepository userRepository

    public User createUser(String email) {
        User newUser = new User(email:email)
        userRepository.save(newUser);
        log.info("Created Information for User: {}", newUser);
        return newUser;
    }
}
