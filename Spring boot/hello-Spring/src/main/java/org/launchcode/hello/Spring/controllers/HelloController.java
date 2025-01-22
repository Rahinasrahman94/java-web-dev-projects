package org.launchcode.hello.Spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {


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
  //  @GetMapping("hello")
  //  @PostMapping("hello")
    @RequestMapping(method={ RequestMethod.GET,RequestMethod.POST},value = "hello")
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
    @GetMapping("form")
    @ResponseBody
    public String helloform()
    {
      return "<html>"+
              "<body>"+
              "<form action ='hello'  method ='post'>"+// submit request to /hello
              "<input type = 'text' name = 'name' >" +
              "<input type = 'submit' value = 'Greet Me!' >" +
              "</form>" +
              "</body>" +
              "</html>"
              ;
    }


}
