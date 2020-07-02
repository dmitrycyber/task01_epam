package by.epamtc.simple.task7;

public class Main {
    public static void main(String[] args) {
        double number = 123.456;
        System.out.println(replaceFractionalAndIntegerParts(number));
    }

    private static double replaceFractionalAndIntegerParts(double number) {
        int fractionalPart = (int) ((number - (int) number) * 1000);
        int integerPart = (int) number;
        return fractionalPart + (double) integerPart / 1000;
    }
}
