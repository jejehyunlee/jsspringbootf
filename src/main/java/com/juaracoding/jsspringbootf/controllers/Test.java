package com.juaracoding.jsspringbootf.controllers;

/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author JEJE a.k.a Jefri S
Java Developer
Created On 2/7/2023 14:04
@Last Modified 2/7/2023 14:04
Version 1.0
*/


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api")

public class Test {

    @GetMapping("/test")
    public String message(){
        return "TEST";
    }
}
