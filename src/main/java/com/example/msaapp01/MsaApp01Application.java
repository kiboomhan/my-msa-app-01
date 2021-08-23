package com.example.msaapp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaApp01Application {

    public static void main(String[] args) {
        SpringApplication.run(MsaApp01Application.class, args);
    }

}
