package com.scaler.suman.UserAuthService1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private String email;
    private String password;
    @OneToMany
    private Set<Role> roles= new HashSet<>();
}
