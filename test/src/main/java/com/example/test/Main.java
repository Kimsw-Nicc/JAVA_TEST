package com.example.test;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@ServletComponentScan
@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories
public class Main {

  // @Autowired
  // private static ScheduledService scheduledService
  
  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(Main.class);
    System.out.println(Math.random());
    springApplication.setBannerMode(Banner.Mode.OFF);
    springApplication.run(args);
    
  }

} 