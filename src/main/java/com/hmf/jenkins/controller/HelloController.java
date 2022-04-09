package com.hmf.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/data")
    public String data() {
        System.out.println("--------------- data --------------");
        return "Hello My Cruel World !!!";
    }

    @GetMapping("/hello")
    public String hello() {
        System.out.println("--------------- hello --------------");
        return "Hello My Cruel World !!! Again !!!";
    }
}
