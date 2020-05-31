package com.divoninsky.simpleTasks.task10;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isIncreasing = true;
        boolean isAdjacentNumbersEquals = false;
        boolean isAlternating = true;
        int currentNumber = sc.nextInt();
        int nextNumber = sc.nextInt();
        while (nextNumber != 0){
            if (currentNumber >= nextNumber){
                isIncreasing = false;
            }
            if (currentNumber == nextNumber){
                isAdjacentNumbersEquals = true;
            }
            if (currentNumber > 0 && nextNumber > 0 || currentNumber < 0 && nextNumber < 0){
                isAlternating = false;
            }
            currentNumber = nextNumber;
            nextNumber = sc.nextInt();
        }
        System.out.println("Возрастающая " + isIncreasing);
        System.out.println("Есть одинаковые соседние числа " + isAdjacentNumbersEquals);
        System.out.println("Знакочередующаяся " + isAlternating);
    }
}
