package com.ttn.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import org.aspectj.apache.bcel.generic.TABLESWITCH
import org.hibernate.validator.constraints.Email

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

/**
 * Created by sachin on 08/02/16.
 */
@Entity
@Table(name="`user`")
public class User extends AbstractAuditingEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @NotNull
//    @Pattern(regexp = "^[a-z0-9]*$|(anonymousUser)")
    @Column(unique = true)
    @Size(max = 100)
    @Email
    @JsonIgnore
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
