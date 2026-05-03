package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        int X = 250;
        int K = 3;
        System.out.println("Ways to reach space №" + X + " with a maximum step of " + K + ": " + Exercise.Calculate(X, K));
    }
}
