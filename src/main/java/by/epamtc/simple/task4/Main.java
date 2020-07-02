package by.epamtc.simple.task4;

public class Main {


    public static void main(String[] args) {
        int x = 14;
        System.out.println(calculateFunctionValue(x));
    }

    private static double calculateFunctionValue(int x) {
        if (x <= 13) {
            return -Math.pow(x, 3) + 9;
        }
        return -(3 / (double) x + 1);
    }


}
