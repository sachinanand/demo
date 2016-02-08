package com.ttn.web.rest

import com.ttn.domain.User
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

/**
 * Created by sachin on 08/02/16.
 */
@RestController
@RequestMapping("/api")
class UserResource {
    private final Logger log = LoggerFactory.getLogger(UserResource.class)

    @RequestMapping(value = "/account",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
//    @Timed
    public ResponseEntity<User> getAccount() {
//        return Optional.ofNullable(userService.getUserWithAuthorities())
//                .map(user -> new ResponseEntity<>(new UserDTO(user), HttpStatus.OK))
//                .orElse(new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));
        return new ResponseEntity<User>(new User(email:"sachin.anand@tothenew.com"), HttpStatus.OK)

    }
}
