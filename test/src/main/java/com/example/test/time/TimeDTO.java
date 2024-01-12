package com.example.test.time;

import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TimeDTO {
  private Integer timeCd;
  private Date timeSdate;
  private Date timeEdate;
  private String timeStime;
  private String timeEtime;
}
