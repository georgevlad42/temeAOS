package com.unitbv.mi.lab2aoshw.functionality;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloFunction {

    @GetMapping
    public String hello(@RequestParam(value="name", defaultValue="World") String name){
        return "Hello " + name + "!";
    }
}
