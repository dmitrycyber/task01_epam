package com.divoninsky.simpleTasks.task1;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        System.out.println(calculateValueOfExpression(a, b, c));
    }

    private static double calculateValueOfExpression(int a, int b, int c) {
        return (b + Math.sqrt(b * b + 4 * a * c))/2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
