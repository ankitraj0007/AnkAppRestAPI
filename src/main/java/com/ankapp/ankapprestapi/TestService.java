package com.ankapp.ankapprestapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestService {

    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin(origins = {"https://ankapp123.herokuapp.com", "http://localhost:4200"})
    public String test(){
        return "Test Success";
    }
}
