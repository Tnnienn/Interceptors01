package co.develhope.interceptorsmiddleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController  {

    @GetMapping(value="")
    public LocalDateTime data(){
        return LocalDateTime.now();
    }

}