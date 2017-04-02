package com.company;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Diagonal_Difference extends Main_menu{
    private int MatrixSize;
    private int[][] Matrix;


    protected void ask_user() {
        System.out.println("*******************************************************");
        System.out.println("Данная программа позволяет найти разность диагоналей матрицы");
        System.out.println("Для самостоятельного ввода матрицы нажмите 1");
        System.out.println("Для заполнения матрицы случайными числами нажмите 2");
        System.out.println("*******************************************************");
    }
    private void SetMatrixSize(){
        System.out.println("Введите размерность матрицы");
        MatrixSize = scanner.nextInt();
    }
    public int GetMatrixSize() {
        System.out.println("Размер квадратной матрицы: " + MatrixSize);
        return MatrixSize;
    }

    private void Random(){
        int n = MatrixSize;
        Matrix = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                Matrix[i][j] = -9 + (int)(Math.random()*19);
            }
        }
    }
    private void ShowMatrix(){
        System.out.println("Матрица: ");
        for(int i=0; i < MatrixSize; i++){
            for(int j=0; j < MatrixSize; j++){
                System.out.print(Matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    private void diagonal_difference()
    {
        int n = MatrixSize;
        int Sum = 0;
        for (int i=0; i<n; i++){
            Sum -= Matrix[i][n-1-i];
            for (int j=0; j<n; j++){
                if (i==j)
                    Sum += Matrix[i][j];

            }
        }
        if (Sum <0)
            Sum = Sum * -1;
        System.out.println("Разность главной и побочной диагонали " +Sum);
    }
    private void Manually(){
        int n = MatrixSize;
        Matrix = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                System.out.format("Введите целое значение элемента Матрица[%d][%d]%n",i+1,j+1);
                int a = scanner.nextInt();
                Matrix[i][j] += a;
            }
        }
    }

    protected void SecondOption(){
        SetMatrixSize();
        Random();
        ShowMatrix();
        diagonal_difference();
    }
    protected void FirstOption(){
        SetMatrixSize();
        Manually();
        ShowMatrix();
        diagonal_difference();
    }
}