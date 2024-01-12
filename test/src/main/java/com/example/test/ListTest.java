package com.example.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Component
public class ListTest {
  private List<A> as = new ArrayList();

  public void initA(){
    for (int i = 0; i < 5; i++) {
      as.add(new A("data"+i, "info"+i));
    }
  }

  public void printA(){
    for (A a : as) {
      System.out.println(a);
    }
  }

  public void changeA(){
    for (A a : as) {
      a.setData("change"+a.getData());
      a.setInfo("change"+a.getData());
    }
  }

  @Data
  @AllArgsConstructor
  class A{
    private String data;
    private String info;
  }
}
