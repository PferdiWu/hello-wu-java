package com.example.hello_wu.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

  @GetMapping("/hello")
  public String hello(@RequestParam String name) {
    return "Hello " + name;
  }
}
