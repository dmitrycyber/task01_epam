package by.epamtc.simple_tasks.task8;

public class Main {
    public static void main(String[] args) {
        int lowerBound = 4;
        int upperBound = 90;
        int step = 2;
        int x = 15;
        calculateFunctionValue(lowerBound, upperBound, step, x);
    }

    private static void calculateFunctionValue(int lowerBound, int upperBound, double step, int x) {
        System.out.println("x = " + x);
        if (x == 15) {
            for (int i = lowerBound; i <= upperBound; i += step) {
                System.out.println("c = " + i + ", y = " + (x + i) * 2);
            }
        } else {
            for (int i = lowerBound; i <= upperBound; i += step) {
                System.out.println("c = " + i + ", y = " + ((x - i) + 6));
            }
        }
    }
}
