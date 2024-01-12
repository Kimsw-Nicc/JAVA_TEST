package com.example.test;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledService {

  private static String cronRule = "* * * * * * *";
  
  // @Scheduled(cron = ScheduledService.cronRule)
  // @Scheduled(fixedDelay = 1000)
  public void printScheduled(){
    System.out.println("hihi");
  }

  public void changeCron(){
    cronRule = "*/4 * * * * * *";
  }
}
