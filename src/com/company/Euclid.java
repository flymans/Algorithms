package com.company;

import java.util.Scanner;

/**
 * Created by AlexPanteleev on 02.04.2017.
 */
public class Euclid extends Main_menu {
    private  void check(int a, int b){
        if (b>a){
            int t = b;
            b = a;
            a = t;
        }
    }
    private  void NOD (int a, int b)
    {
        check(a, b);
        while(b!=0)
        {
            int t = a%b;
            a = b;
            b = t;
        }
        System.out.println("НОД: " +a);

    }
    private  void User()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        NOD(a,b);
    }
    private  void Random(){
        int a = (int)(Math.random()*100000);
        int b = (int)(Math.random()*100000);
        System.out.println("Первое число " +a);
        System.out.println("Второе число " +b);
        NOD(a,b);
    }
    protected void ask_user() {
        System.out.println("*******************************************************");
        System.out.println("Данная программа позволяет найти наибольший общий делитель двух чисел");
        System.out.println("Для самостоятельного ввода двух чисел нажмите 1");
        System.out.println("Для выобра случайных чисел в промежутке [0;100000) нажмите 2");
        System.out.println("*******************************************************");
    }
    protected void FirstOption(){
        User();
    }
    protected void SecondOption(){
        Random();
    }

}
