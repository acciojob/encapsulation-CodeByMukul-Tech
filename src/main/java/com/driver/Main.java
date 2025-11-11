package com.driver;
import java.util.Scanner;

// import com.driver.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       RWOnly s1 = new RWOnly();
       String s = sc.next();
       s1.setName(s);
       System.out.println(s1.getName());
       sc.close();
    }
  
}