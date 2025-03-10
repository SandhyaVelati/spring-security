package com.northcoders.SecurityPlayground.controller;

import com.northcoders.SecurityPlayground.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {
    @Autowired
    private UserService oAuth2UserService;              //optional
// -- /api/v1/open/greeting
    @GetMapping("/open/greeting")
    public String getFormalGreeting(){
        Object loggedinUser = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println("i am the user   "+loggedinUser);
        return "Welcome aboard, "+ loggedinUser;
    }
//-- /api/v1/protected/greeting
    @GetMapping("/protected/greeting")
    public String getFriendlyGreeting(){
        OAuth2User principal = (OAuth2User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String loggedinUser = principal.getAttribute("login").toString();
        String name = principal.getAttribute("name").toString();
        System.out.println("i am the logged in user   "+ principal.getAttribute("login"));
        System.out.println("i am the user   "+ principal.getAttribute("name"));
        return "Hey, "+name +" you are logged in as "+ loggedinUser ;
    }

}
