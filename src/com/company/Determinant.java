package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Determinant {

    public static void determinant() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int Sum = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = (int)(Math.random()*1000);
            }
        }
        System.out.println("Случайная матрица: ");
        for(int a_i=0; a_i < n; a_i++){
            System.out.println();
            for(int a_j=0; a_j < n; a_j++){
                System.out.print(a[a_i][a_j]+"\t");

            }
        }
        for (int i=0; i<n; i++){
            Sum -= a[i][n-1-i];
            for (int j=0; j<n; j++){
                if (i==j)
                    Sum += a[i][j];

            }
        }
        if (Sum<0)
            Sum = Sum * -1;
        System.out.print("\nОпределитель равен= "+Sum);
    }
}
