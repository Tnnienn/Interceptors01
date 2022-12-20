package co.develhope.interceptorsmiddleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerInterceptor;

@RestController
@RequestMapping(value = "legacy")
public class LegacyController implements HandlerInterceptor {

    @GetMapping(value= "")
    public String massage(){
        return "This is an old message";
    }

}

