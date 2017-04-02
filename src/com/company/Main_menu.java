package com.company;

import java.util.Scanner;

/**
 * Created by AlexPanteleev on 02.04.2017.
 */
public class Main_menu {
    Scanner scanner = new Scanner(System.in);
    int UserChoice = 0;

    public  void main_menu() {
        ask_user();
        SetUserChoice();
        begin(UserChoice);
    }

    protected void ask_user() {
        System.out.println("*******************************************************");
        System.out.println("Приветствую Вас в моем мини-наборе простеньких алгоритмов");
        System.out.println("Алгоритм Евклида - нажмите 1");
        System.out.println("Нахождение разности диагоналей матрицы - нажмите 2");
        System.out.println("Подсчет доли положительных, отрицательных и нулевых чисел  - нажмите 3");
        System.out.println("*******************************************************");
    }

    private void SetUserChoice(){
        UserChoice = scanner.nextInt();
    }

    private void begin(int choice) {
        boolean isTrue = true;
        while (isTrue) {
            isTrue = false;

            switch (choice) {
                case 1:
                    FirstOption();
                    ContinueOrExit();

                case 2:
                    SecondOption();
                    ContinueOrExit();

                case 3:
                    ThirdOption();
                    ContinueOrExit();

                default:
                    System.out.println("Повторите ввод");
                    isTrue = true;
                    SetUserChoice();
                    choice = UserChoice;
            }
        }
    }
    private void ContinueOrExit(){
        System.out.println("*******************************************************");
        System.out.println("Вернуться назад - нажмите 0");
        System.out.println("Возвращение в главное меню - нажмите 9");
        System.out.println("Для выхода из программы - нажмите что-то еще");
        int choice = scanner.nextInt();
        if (choice == 0)
            main_menu();
        else if(choice == 9) {
            Main_menu menu = new Main_menu();
            menu.main_menu();
        }
        else System.exit(0);
    }
    protected void FirstOption(){
        Euclid euclid = new Euclid();
        euclid.main_menu();
    }
    protected void SecondOption()
    {
        Diagonal_Difference diagonal_difference = new Diagonal_Difference();
        diagonal_difference.main_menu();
    }
    protected void ThirdOption()
    {
        Plus_Minus_Zero plus_minus_zero = new Plus_Minus_Zero();
        plus_minus_zero.main_menu();
    }
}
