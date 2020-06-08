package by.epamtc.simple_tasks.task9;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateValueOfExpression());
    }

    private static long calculateValueOfExpression() {
        long result = 1 + 2;
        for (int i = 3; i <= 10; i++) {
            int sumOfCurrentStep = (1 + i) * i / 2;
            result *= sumOfCurrentStep;
        }
        return result;
    }
}
