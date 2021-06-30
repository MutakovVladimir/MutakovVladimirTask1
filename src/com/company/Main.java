package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner x = new Scanner(System.in);{
	    try { System.out.println("Введите число");
                int y = x.nextInt();
                if (y>7){
                    System.out.println("Привет");
                }
            } catch (InputMismatchException e) {e.printStackTrace();
            System.out.println("Неверный формат ввода данных");
	    }
	    x.close();
        }
    }
}
