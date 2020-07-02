package by.epamtc.simple.task10;

import java.util.Scanner;

public class NumberScanner {
    private static Scanner scanner = new Scanner(System.in);

    public static int getNumberFromKeyboard() {
        System.out.println("Enter your number");
        return scanner.nextInt();
    }
}
