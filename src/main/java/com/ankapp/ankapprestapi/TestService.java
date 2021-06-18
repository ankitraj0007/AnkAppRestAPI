package com.ankapp.ankapprestapi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestService {

    @RequestMapping(method = RequestMethod.GET)
    public String test(){
        return "Test Success";
    }
}
