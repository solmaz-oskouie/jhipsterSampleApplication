package com.rasapardaz.carpad.webapp.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.rasapardaz.carpad.webapp")
public class FeignConfiguration {

}
