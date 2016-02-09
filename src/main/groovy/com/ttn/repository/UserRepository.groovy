package com.ttn.repository

import com.ttn.domain.User
import org.springframework.data.jpa.repository.JpaRepository

import java.time.ZonedDateTime

/**
 * Created by sachin on 09/02/16.
 */
interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findOneByEmail(String email);
    Optional<User> findOneById(Long userId);

    @Override
    void delete(User t);

}