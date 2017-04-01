package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
main_menu();
Determinant.determinant();

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
        System.out.println("НОД= " +a);

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
        int a = (int)(Math.random()*100000);
        int b = (int)(Math.random()*100000);
        System.out.println("Первое число " +a);
        System.out.println("Второе число " +b);
        NOD(a,b);
    }
    public static void main_menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************************************");
        System.out.println("Данная программа позволяет найти наибольший общий делитель двух чисел");
        System.out.println("Для самостоятельного ввода двух чисел нажмите 1");
        System.out.println("Для выобра случайных чисел в промежутке [0;100000) нажмите 2");
        System.out.println("*******************************************************");
        boolean isTrue = true;
        while (isTrue)
        {
            isTrue = false;

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    User();
                    break;
                case 2:
                    Random();
                    break;
                default:
                    System.out.println("Повторите ввод");
                    isTrue = true;
                    break;
            }

        }

    }

}
