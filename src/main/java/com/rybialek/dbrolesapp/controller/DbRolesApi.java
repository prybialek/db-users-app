package com.rybialek.dbrolesapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbRolesApi {

    @GetMapping("/user")
    public String test1(){
        return "User Page";
    }

    @GetMapping("/admin")
    public String test2(){
        return "Admin Page";
    }

}
