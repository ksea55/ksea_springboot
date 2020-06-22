package org.ksea.springboot2.started;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// 默认情况下 springboot扫描的是启动项StartedApplication下的子包，ComponentScan 指定扫描包
@ComponentScan(basePackages = {"org.ksea.springboot2.controller"})
@SpringBootApplication
public class StartedApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartedApplication.class, args);
    }

}
