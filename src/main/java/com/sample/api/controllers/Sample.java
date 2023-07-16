package com.sample.api.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class Sample {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String simpleHello() {
        return "Greetings, mortal.";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloHuman(@RequestParam(name = "name", required = false, defaultValue = "Human") String name) {
        return "Hello, " + name + ".";
    }
}
