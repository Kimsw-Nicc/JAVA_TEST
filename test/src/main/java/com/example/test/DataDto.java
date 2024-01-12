package com.example.test;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DataDto {
  
  private String str;
  private Integer integer;

  @Override
  public int hashCode(){
    return integer;
  }
  @Override
  public boolean equals(Object obj){
    if(obj==null) return false;
    else if(this==obj) return true;
    else return this.hashCode() == obj.hashCode();
  }
}
