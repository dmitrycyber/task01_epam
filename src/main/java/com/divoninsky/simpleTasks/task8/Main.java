package com.divoninsky.simpleTasks.task8;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        int h = 1;
        int x = 16;
        calculateFunctionValue(a, b, h, x);
    }

    private static void calculateFunctionValue(int a, int b, int h, int x) {
        System.out.println("x = " + x);
        if (x == 15){
            for (int i = a; i <= b; i+=h) {
                System.out.println("c = " + i + ", y = " + (x+i)*2);
            }
        }
        else{
            for (int i = a; i <= b; i+=h) {
                System.out.println("c = " + i + ", y = " + (x-i)+6);
            }
        }
    }
}
