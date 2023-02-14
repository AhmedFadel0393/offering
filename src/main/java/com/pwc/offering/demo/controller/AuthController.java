package com.pwc.offering.demo.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class AuthController {

    @GetMapping("/CurrentUser")
    public Map<String, Object> user() {
        OAuth2User principal = (OAuth2User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return Collections.singletonMap("name", principal.getAttribute("name")+" - "+principal.getAttribute("email"));
    }
}
