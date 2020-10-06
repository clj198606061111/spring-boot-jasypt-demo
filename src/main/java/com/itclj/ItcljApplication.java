package com.itclj;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItcljApplication {
    public static void main(String[] args) {

        System.setProperty("jasypt.encryptor.password","itclj@2020");

        SpringApplication.run(ItcljApplication.class,args);
    }
}
