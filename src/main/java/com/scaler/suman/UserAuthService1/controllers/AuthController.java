package com.scaler.suman.UserAuthService1.controllers;

import com.scaler.suman.UserAuthService1.dtos.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    // Signup
    // Login
    // Forgot Password
    // Logout
    // ...

    @PostMapping("/signup")
    public UserDto signUp(@RequestBody SignupRequestDto signupRequestDto){
        return null;
    }

    @PostMapping("/login")
    public UserDto login(@RequestBody LoginRequestDto loginRequestDto){
        return null;
    }

    public ResponseEntity<Boolean> logout(@RequestBody LogoutRequestDto logoutRequestDto){
        return null;
    }

    public ResponseEntity<String> forgetPassword(@RequestBody ForgetPasswordDto forgetPasswordDto){
        return null;
    }
}
