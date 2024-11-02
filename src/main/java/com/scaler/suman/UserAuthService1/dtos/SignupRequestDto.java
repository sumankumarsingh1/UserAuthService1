package com.scaler.suman.UserAuthService1.dtos;

import com.scaler.suman.UserAuthService1.models.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
    private String email;
    private String password;
}
