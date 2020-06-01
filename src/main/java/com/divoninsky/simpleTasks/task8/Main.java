package com.divoninsky.simpleTasks.task8;

public class Main {
    public static void main(String[] args) {
        int lowerBound = 0;
        int upperBound = 5;
        int step = 1;
        int x = 16;
        calculateFunctionValue(lowerBound, upperBound, step, x);
    }

    private static void calculateFunctionValue(int lowerBound, int upperBound, int step, int x) {
        System.out.println("x = " + x);
        if (x == 15){
            for (int i = lowerBound; i <= upperBound; i+=step) {
                System.out.println("c = " + i + ", y = " + (x+i)*2);
            }
        }
        else{
            for (int i = lowerBound; i <= upperBound; i+=step) {
                System.out.println("c = " + i + ", y = " + (x-i)+6);
            }
        }
    }
}
