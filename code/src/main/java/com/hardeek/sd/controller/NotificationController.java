package com.hardeek.sd.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {

    Logger log =  LoggerFactory.getLogger(NotificationController.class);

    @GetMapping
    public String hello(){
        return "I am notification api";
    }


}
