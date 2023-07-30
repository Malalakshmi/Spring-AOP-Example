package com.learningTech;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.learningTech")
@EnableAspectJAutoProxy
public class BeanConfig {
}
