package com.example.test.time;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
public class TimeServiceImpl implements TimeService {

  // @Autowired
  // TimeRepo timeRepo;

  // public Boolean timeTest(String startTime, String endTime) {
  //   List<Time> times = timeRepo.findAll(); // 장비 구분 + 날짜 포함 여부 확인하여 Date 가져오기
  //   List<Period> periods = new ArrayList<>();
  //   for (Time time : times) {
  //     Long startMillis = calcMillis(time.getTimeStime());
  //     Long endMillis = calcMillis(time.getTimeEtime());
  //     periods.add(new Period(startMillis, endMillis));
  //   }
  //   Long startTimeMillis = calcMillis(startTime);
  //   Long endTimeMillis = calcMillis(endTime);
  //   System.out.println(startTimeMillis + " " + endTimeMillis);
  //   for (Period period : periods) {
  //     System.out.println(period.toString());
  //     if ((startTimeMillis < period.getEndMillis() && startTimeMillis > period.getStartMillis())
  //         || (endTimeMillis < period.getEndMillis() && endTimeMillis > period.getStartMillis())
  //         || (endTimeMillis.equals(period.getEndMillis()) && startTimeMillis.equals(period.getStartMillis()))) {
  //       return false;
  //     }
  //   }
    
  //   return true;
  // }

  // private Long calcMillis(String time) {
  //   String[] timeinfo = time.split(":");
  //   Long result = new Long(0);
  //   result += Integer.parseInt(timeinfo[0]) * 60 * 60 * 1000;
  //   result += Integer.parseInt(timeinfo[1]) * 60 * 1000;
  //   return result;
  // }

  // @Data
  // @AllArgsConstructor
  // public class Period {
  //   private Long startMillis;
  //   private Long endMillis;

  // }
}
