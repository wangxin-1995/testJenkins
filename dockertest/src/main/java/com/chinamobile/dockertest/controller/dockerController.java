package com.chinamobile.dockertest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dockerController {

    @RequestMapping("/hello")
    public String firstDocker(){
        return "hellodocker";
    }
}
