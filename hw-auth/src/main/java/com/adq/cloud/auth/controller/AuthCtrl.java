package com.adq.cloud.auth.controller;

import com.adq.cloud.auth.feign.service.AuthFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthCtrl {

  @Autowired
  private AuthFeignService authFeignService;

  @GetMapping("/hello")
  public String hello(){
    return "Auth Hello World";
  }

  @GetMapping("/feignHello")
  public String feignHello(){
    return authFeignService.hello();
  }
}
