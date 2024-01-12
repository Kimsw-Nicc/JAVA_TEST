package com.example.test;

import org.springframework.stereotype.Component;

@Component
public class VargsTest {

  public void printVargs(String... param) throws IndexOutOfBoundsException{
    System.out.print("+"+param[0]+"+");
    // System.out.println(param[1]);
    for (String string : param) {
      System.out.print(string);
    }
    System.out.println();
  }
}
