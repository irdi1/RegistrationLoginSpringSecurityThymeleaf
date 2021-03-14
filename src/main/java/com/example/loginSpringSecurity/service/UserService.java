package com.example.loginSpringSecurity.service;

import com.example.loginSpringSecurity.model.User;
import com.example.loginSpringSecurity.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
