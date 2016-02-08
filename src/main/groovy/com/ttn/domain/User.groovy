package com.ttn.domain

import org.hibernate.validator.constraints.Email
import org.springframework.data.annotation.Id

import javax.persistence.Column
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

/**
 * Created by sachin on 08/02/16.
 */
public class User extends AbstractAuditingEntity implements Serializable {

    @Id
    private String id;

    @NotNull
//    @Pattern(regexp = "^[a-z0-9]*$|(anonymousUser)")
    @Column(unique = true)
    @Size(max = 100)
    @Email
    private String email;

    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    String getEmail() {
        return email
    }

    void setEmail(String email) {
        this.email = email
    }
}
