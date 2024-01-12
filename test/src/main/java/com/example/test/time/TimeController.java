package com.example.test.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/time")
public class TimeController {
  @Autowired
  TimeService timeService;
  
  // @GetMapping("/test")
  // public Boolean timeTest(@RequestParam String startTime, @RequestParam String endTime){
  //   // return timeService.timeTest(startTime, endTime);
  // }
}
