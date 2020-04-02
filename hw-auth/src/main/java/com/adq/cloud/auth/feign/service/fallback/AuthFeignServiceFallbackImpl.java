package com.adq.cloud.auth.feign.service.fallback;

import com.adq.cloud.auth.feign.service.AuthFeignService;
import org.springframework.stereotype.Component;

@Component
public class AuthFeignServiceFallbackImpl implements AuthFeignService {

  @Override
  public String hello() {
    return "Feign Hello World";
  }
}
