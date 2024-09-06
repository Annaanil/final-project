package com.example.anildevops;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Anil devops-final-project java 17 succesfully done by me and successfully deployed in internet for accesing end user !!!!";
    }

 }
