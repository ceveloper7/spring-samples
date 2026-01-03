package com.ceva.firstspring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello(){
        return new HelloResponse("Welcome to Hello Banking API!");
    }

    @GetMapping("/hello/{name}")
    public HelloResponse helloParam(@PathVariable String name){
        return new HelloResponse("Hello, what a beautiful world " + name);
    }

    // Name variable se pasa en el cuerpo del request
    @PostMapping("/hello")
    public HelloResponse helloPost(@RequestBody String name){
        return  new HelloResponse("Hello " + name + "!" + " Welcome to Hello Banking API");
    }
}
