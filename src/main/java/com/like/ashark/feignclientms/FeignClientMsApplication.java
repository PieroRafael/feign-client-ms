package com.like.ashark.feignclientms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignClientMsApplication.class, args);
    }

}
