package com.example.demo;

import com.example.demo.aspect.MyAspect;
import com.example.demo.util.MyAspect1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.example.demo"})
public class Demo1Application {

    @Bean(name="myAspect")
    public MyAspect initMyAspect(){
        return new MyAspect();
    }

    @Bean(name="myAspect1")
    public MyAspect1 initMyAspect1(){
        return new MyAspect1();
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

}
