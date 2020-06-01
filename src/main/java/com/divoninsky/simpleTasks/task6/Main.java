package com.divoninsky.simpleTasks.task6;

public class Main {
    public static void main(String[] args) {
        int a1 = 100;
        int d = 500;

        System.out.println("for int: " + checkIfSumOfProgressionOverThanInt(a1, d));
        System.out.println("for long: " + checkIfSumOfProgressionOverThanLong(a1, d));
    }

    private static int checkIfSumOfProgressionOverThanInt(int a1, int d) {
        int sumOfProgression = 0;
        int count = 1;
        int lastNumber = a1;
        if (d > 0){
            while (sumOfProgression >= 0){
                lastNumber+=d;
                count++;
                sumOfProgression += lastNumber;
            }
            return count;
        }
        while (sumOfProgression <= 0){
            sumOfProgression -= lastNumber;
            lastNumber-=d;
            count++;
        }
        return count;
    }

    private static long checkIfSumOfProgressionOverThanLong(int a1, int d) {
        long sumOfProgression = 0;
        long count = 1;
        long lastNumber = a1;
        if (d > 0){
            while (sumOfProgression >= 0){
                lastNumber+=d;
                count++;
                sumOfProgression += lastNumber;
            }
            return count;
        }
        while (sumOfProgression <= 0){
            sumOfProgression -= lastNumber;
            lastNumber-=d;
            count++;
        }
        return count;
    }


}
