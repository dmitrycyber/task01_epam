package com.divoninsky.simpleTasks.task6;

public class Main {
    public static void main(String[] args) {
        int a1 = 1;
        int d = 500;

        System.out.println(checkIfSumOfProgressionOverThanInt(a1, d));
        System.out.println(checkIfSumOfProgressionOverThanLong(a1, d));
    }

    private static int checkIfSumOfProgressionOverThanInt(int a1, int d) {
        int sumOfProgression = 0;
        int count = 1;
        int lastNumber = a1;
        while (sumOfProgression >= 0){
            lastNumber+=d;
            count++;
            sumOfProgression = (a1+lastNumber)*count/2;
        }
        return lastNumber;
    }

    private static long checkIfSumOfProgressionOverThanLong(int a1, int d) {
        long sumOfProgression = 0;
        long count = 1;
        long lastNumber = a1;
        while (sumOfProgression >= 0){
            lastNumber+=d;
            count++;
            sumOfProgression = (a1+lastNumber)*count/2;
        }
        return lastNumber;
    }


}
