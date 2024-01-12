package com.example.test.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "time")
public class Time {
  
  @Id
  @Column(name="time_cd")
  private Integer timeCd;
  @Column(name="time_sdate")
  private Date timeSdate;
  @Column(name="time_edate")
  private Date timeEdate;
  @Column(name="time_stime")
  private String timeStime;
  @Column(name="time_etime")
  private String timeEtime;


}
