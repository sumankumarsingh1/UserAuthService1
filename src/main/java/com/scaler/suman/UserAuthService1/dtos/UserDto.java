package com.scaler.suman.UserAuthService1.dtos;

import com.scaler.suman.UserAuthService1.models.BaseModel;
import com.scaler.suman.UserAuthService1.models.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto extends BaseModel {
    private String email;
    private Role role;
}
