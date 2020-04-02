package com.adq.cloud.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminCtrl {

  @GetMapping("/hello")
  public String hello(){
    return "Hello World";
  }
}
