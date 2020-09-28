package com.hardeek.sd.controller;

import com.hardeek.sd.service.AuthenticationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/user")
@RestController
public class UserController {

    Logger log =  LoggerFactory.getLogger(UserController.class);

    @Autowired
    AuthenticationService authenticationService;

    @GetMapping
    public String hello(){
        return "I am user api";
    }

}
