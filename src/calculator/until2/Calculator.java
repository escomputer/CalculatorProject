package calculator.until2;


import java.util.ArrayList;

public class Calculator {
    private static final ArrayList<Double> results = new ArrayList<>();
    private static final int MAX_SIZE = 5;

    public double calculate(int a, int b, char operator) {


        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException();
                } else {
                    return (double) a / b;
                }
            default:
                throw new IllegalArgumentException();

        }
    }

    public void addResult(double result) {
        results.add(result);
        removeOldestResult();
    }

    public void removeOldestResult() {
        if (results.size() > MAX_SIZE) {
            results.remove(0);
        }
    }

    public ArrayList<Double> getResult() {
        return new ArrayList<>(results);
    }


}