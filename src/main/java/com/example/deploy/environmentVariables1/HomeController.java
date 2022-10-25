package com.example.deploy.environmentVariables1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    Environment environment;

    @GetMapping
    public String getMessage(){
        return "Welcome "+ environment.getProperty("devName")+ " your auth code is: " + environment.getProperty("authCode");
    }
}
