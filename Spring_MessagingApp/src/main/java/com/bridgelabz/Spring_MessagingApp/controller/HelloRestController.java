package com.bridgelabz.Spring_MessagingApp.controller;

import com.bridgelabz.Spring_MessagingApp.model.User;
import org.springframework.web.bind.annotation.*;

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

    //UC4
    @PostMapping("/hello/post")
    public String sayHello(@RequestBody User user){
        return "Hello " + user.getFirstName() + " " + user.getLastName();
    }

    //UC5
    @PutMapping("/hello/param/{firstName}")
    public String pathAndRequest(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello "+ firstName + " " + lastName;
    }
}
