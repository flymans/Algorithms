package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    User();

    }
    public static void check(int a, int b){
      if (b>a){
          int t = b;
          b = a;
          a = t;
      }
    }
    public static void NOD (int a, int b)
    {
        check(a, b);
        while(b!=0)
        {
            int t = a%b;
            a = b;
            b = t;
        }
        System.out.print("НОД= " +a);

    }
    public static void User()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        NOD(a,b);
    }
    public static void Random(){
        
    }

}
