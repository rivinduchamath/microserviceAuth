package com.cloudofgoods.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.cloudofgoods.service"})
public class ServiceConfig {
}
