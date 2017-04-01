package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Diagonal_Difference {
    private static Scanner in = new Scanner(System.in);
    public static void main_menu()
    {

    }

    public  static void diagonal_difference() {

        System.out.println("Введите размерность матрицы");
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int Sum = 0;
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = -9 + (int)(Math.random()*19);
            }
        }
        System.out.println("Случайная матрица: ");
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i=0; i<n; i++){
            Sum -= a[i][n-1-i];
            for (int j=0; j<n; j++){
                if (i==j)
                    Sum += a[i][j];

            }
        }
        if (Sum <0) {
            Sum = Sum * -1;
            System.out.println("Разность главной и побочной диагонали ");
        }
    }
}
