package by.epamtc.simple_tasks.task1;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        System.out.println(calculateValueOfExpression(a, b, c));
    }

    private static double calculateValueOfExpression(int a, int b, int c) {
        return ((b + sqrt(pow(b, 2) + 4 * a * c)) / (2 * a)) - pow(a, 3) * c + pow(b, -2);
    }
}
