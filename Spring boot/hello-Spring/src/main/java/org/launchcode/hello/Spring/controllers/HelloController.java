package org.launchcode.hello.Spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    @GetMapping("greetme")
    @ResponseBody
    public String greet() {
        return "Hello Rahina!";
    }
    @GetMapping("hello1")
    @ResponseBody
    public  String hellowithQeuryParam(@RequestParam String name)
    {
        return "Hello," + name+"!";
    }
    @GetMapping("hello1/{name}")
    @ResponseBody
    public  String hellowithPathParam(@PathVariable String name)
    {
        return "Hello path param," + name+"!";
    }


}
