package com.divoninsky.simpleTasks.task5;

public class Main {
    public static void main(String[] args) {
        int number = 137;
        getSumOfNumeral(number);
        getMultiplyNumeral(number);
        getNumberWithReplacedTensAndHundreds(number);
        getNumberWithUnitsAsThousands(number);
    }

    private static int getSumOfNumeral(int number) {
        return (number / 100) + (number / 10 % 10) + (number % 10);
    }

    private static int getMultiplyNumeral(int number) {
        return (number / 100) * (number / 10 % 10) * (number % 10);
    }

    private static int getNumberWithReplacedTensAndHundreds(int number) {
        return (number / 10 % 10)*100 + (number / 100)*10 + (number % 10);
    }

    private static int getNumberWithUnitsAsThousands(int number) {
        return  (number % 10) * 1000 + number;
    }




}
