package com.scaler.suman.UserAuthService1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
public class Role extends BaseModel{
    private String value;
//    @ManyToMany(mappedBy = "roles")
//    private Set<User> users;
}
