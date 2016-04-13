package com.ttn.web.rest

import com.ttn.domain.User
import com.ttn.repository.UserRepository
import com.ttn.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import spock.lang.Specification

/**
 * Created by sachin on 10/02/16.
 */
class UserResourceTest extends Specification {

    private UserService userService
    private UserResource resource

    void setup() {
        resource = new UserResource()
        userService = Mock(UserService)
        resource.userService = userService
    }

    def "GetUser"() {
        when:
            ResponseEntity entity = resource.getUser()
        then:
            1 * userService.findByEmail(_) >> Optional.ofNullable(new User(email: "sachin.anand@tothenew.com"))
            entity.statusCode == HttpStatus.OK
    }

    def "SaveUser"() {

        when:
            ResponseEntity entity = resource.saveUser()
        then:
            1 * userService.createUser(_) >> new User(email: "sachin.anand@tothenew.com")
            entity.statusCode == HttpStatus.CREATED


    }
}
