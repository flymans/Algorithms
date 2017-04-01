package com.company;

import java.util.Scanner;

/**
 * Created by AlexPanteleev on 02.04.2017.
 */
public class Main_menu {
    private int UserChoice;
    Scanner scanner = new Scanner(System.in);
    public  void main_menu() {
    UserChoice = ask_user();
        begin(UserChoice);
    }

    private int ask_user() {
        System.out.println("*******************************************************");
        System.out.println("Приветствую Вас в моем мини-наборе простеньких алгоритмов");
        System.out.println("Алгоритм Евклида - нажмите 1");
        System.out.println("Нахождение разности диагоналей матрицы - нажмите 2");
        System.out.println("*******************************************************");
        int choice = scanner.nextInt();
        return choice;
    }

    private void begin(int choice) {
        boolean isTrue = true;
        while (isTrue) {
            isTrue = false;

            switch (choice) {
                case 1:
                    Euclid menu = new Euclid();
                    menu.main_menu();
                    ContinueOrExit();

                case 2:
                    Diagonal_Difference.diagonal_difference();
                    ContinueOrExit();

                default:
                    System.out.println("Повторите ввод");
                    isTrue = true;
                    choice = ask_user();
            }
        }
    }
    private void ContinueOrExit(){
        System.out.println("*******************************************************");
        System.out.println("Для возвращение в главное меню нажмите 0");
        if (scanner.nextInt() == 0) main_menu();
        else System.exit(0);


    }
}
