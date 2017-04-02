package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by AlexPanteleev on 03.04.2017.
 */
public class Plus_Minus_Zero extends Main_menu {
    private int plus = 0, minus = 0, zero = 0, ArrayLength;
    private double PlusFraction, MinusFraction, ZeroFraction;
    private int[] Array;

    protected void ask_user() {
        System.out.println("*******************************************************");
        System.out.println("Данная программа позволяет подсчитать долю введенных положительных, отрицательных и нулевых чисел");
        System.out.println("Для самостоятельного ввода чисел нажмите 1");
        System.out.println("Для заполнения случайными числами нажмите 2");
        System.out.println("*******************************************************");
    }

    private void SetArrayLength() {
        System.out.println("Введите длину массива чисел");
        ArrayLength = scanner.nextInt();
    }

    public int GetArrayLength() {
        System.out.println("Длина массива чисел: " + ArrayLength);
        return ArrayLength;
    }

    private void Random() {
        Array = new int[ArrayLength];
        for (int i = 0; i < ArrayLength; i++) {
            Array[i] = -99 + (int) (Math.random() * 199);
        }
    }

    private void Manually() {
        Array = new int[ArrayLength];
        for (int i = 0; i < ArrayLength; i++) {
            System.out.format("Введите целое число [%d]%n", i + 1);
            int number = scanner.nextInt();
            Array[i] += number;
        }
    }


    private void ShowArray(){
        for (int i=0; i<ArrayLength; i++){
            System.out.print(Array[i]+"  ");
        }
        System.out.println();
    }


    private void Count() {


        for (int i=0; i < ArrayLength; i++) {
            if (Array[i]>0) plus++;
            else if (Array[i]<0) minus++;
            else if (Array[i]==0) zero++;
        }
    }
    private void SetResult() {
        PlusFraction = (double) plus / ArrayLength;
        MinusFraction = (double) minus / ArrayLength;
        ZeroFraction = (double) zero / ArrayLength;
    }
    private void GetResult() {
        System.out.println("Доля положительных чисел: "+PlusFraction);
        System.out.println("Доля отрицательных чисел: "+MinusFraction);
        System.out.println("Доля нулевых чисел: "+ZeroFraction);
    }
    protected void FirstOption(){
    SetArrayLength();
    Manually();
    ShowArray();
    Count();
    SetResult();
    GetResult();
    }
    protected void SecondOption(){
        SetArrayLength();
        Random();
        ShowArray();
        Count();
        SetResult();
        GetResult();
    }
}
