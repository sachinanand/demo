package com.ttn.service

import com.ttn.domain.User
import com.ttn.repository.UserRepository
import spock.lang.Specification

/**
 * Created by sachin on 10/02/16.
 */
class UserServiceTest extends Specification {


    private UserRepository userRepository
    UserService service

    void setup() {
        service = new UserService()
        userRepository = Mock(UserRepository)
        service.userRepository = userRepository

    }

    def "test Create User"() {
        when:
            User user = service.createUser("sachin@fdafsa.com")
        then:
            1 * userRepository.save(_)
            user != null
    }

    def "test FindByEmail"() {

        when:
            Optional<User> user = service.findByEmail("sachin@fdafsa.com")
        then:
            1 * userRepository.findOneByEmail(_) >> Optional.ofNullable(new User(email:"sachin@intelligrape.com"))
            user.isPresent()


    }
}
