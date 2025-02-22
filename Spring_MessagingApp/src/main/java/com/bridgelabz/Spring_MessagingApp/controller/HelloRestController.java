package com.bridgelabz.Spring_MessagingApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    //UC1
    @GetMapping("/hello")
    public String printHello(){
       return "Hello from BridgeLabz";
    }

    //UC2
    @GetMapping("/hello/query")
    public String printHello(@RequestParam(value = "name") String name){
        return "Hello " + name;
    }

    //UC3
    @GetMapping("/hello/param/{name}")
    public String printHelloParam(@PathVariable String name){
        return "Hello " + name;
    }


}
