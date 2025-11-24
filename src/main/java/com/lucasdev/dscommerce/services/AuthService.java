package com.lucasdev.dscommerce.services;

import com.lucasdev.dscommerce.entities.User;
import com.lucasdev.dscommerce.services.exceptions.ForbiddenExeception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    public void validateSelfOrAdimin(Long userId) {
        User me = userService.authenticated();
        if (!me.hasRole("ROLE_ADMIN") && !me.getId().equals(userId)){
            throw new ForbiddenExeception("Access denied");
        }
    }
}
