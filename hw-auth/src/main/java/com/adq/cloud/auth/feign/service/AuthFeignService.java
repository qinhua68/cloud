package com.adq.cloud.auth.feign.service;

import com.adq.cloud.auth.feign.service.fallback.AuthFeignServiceFallbackImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "hw-admin" , fallback = AuthFeignServiceFallbackImpl.class)
public interface AuthFeignService {

  @GetMapping("/hello")
  String hello();
}
