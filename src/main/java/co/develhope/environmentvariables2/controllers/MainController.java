package co.develhope.environmentvariables2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @Autowired
    private Environment environment;

    @Autowired
    public MainController(Environment environment){
        this.environment = environment;
    }

    @GetMapping("/")
    public String msg(){
        return environment.getProperty("welcomeMsg");
    }
}