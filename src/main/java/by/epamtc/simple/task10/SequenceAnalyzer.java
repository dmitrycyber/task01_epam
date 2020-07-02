package by.epamtc.simple.task10;

public class SequenceAnalyzer {
    private boolean isIncreasing = true;
    private boolean isAdjacentNumbersEquals = false;
    private boolean isAlternating = true;

    public void analyze() {
        int currentNumber = NumberScanner.getNumberFromKeyboard();
        int nextNumber = NumberScanner.getNumberFromKeyboard();
        while (nextNumber != 0) {
            if (currentNumber >= nextNumber) {
                isIncreasing = false;
            }
            if (currentNumber == nextNumber) {
                isAdjacentNumbersEquals = true;
            }
            if (currentNumber > 0 && nextNumber > 0 || currentNumber < 0 && nextNumber < 0) {
                isAlternating = false;
            }
            currentNumber = nextNumber;
            nextNumber = NumberScanner.getNumberFromKeyboard();
        }
    }

    public boolean isIncreasing() {
        return isIncreasing;
    }

    public boolean isAdjacentNumbersEquals() {
        return isAdjacentNumbersEquals;
    }

    public boolean isAlternating() {
        return isAlternating;
    }

    public void printSequenceСharacteristics() {
        System.out.println("Возрастающая " + isIncreasing);
        System.out.println("Есть одинаковые соседние числа " + isAdjacentNumbersEquals);
        System.out.println("Знакочередующаяся " + isAlternating);
    }
}
