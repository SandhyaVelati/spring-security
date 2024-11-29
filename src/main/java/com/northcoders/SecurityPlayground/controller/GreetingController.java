package com.northcoders.SecurityPlayground.controller;

import jdk.jfr.ContentType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {
// -- /api/v1/open/greeting
    @GetMapping("/open/greeting")
    public String getFormalGreeting(){
        return "Welcome aboard, User";
    }
//-- /api/v1/protected/greeting
    @GetMapping("/protected/greeting")
    public String getFriendlyGreeting(){
        return "Hey User, great having you in our team" ;
    }

}
