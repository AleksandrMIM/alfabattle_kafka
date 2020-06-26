package com.alfabattle;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AlfaBattleApplication {
  public static void main(String[] args) {
    SpringApplication.run(AlfaBattleApplication.class, args);
  }
}