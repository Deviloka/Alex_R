package org.example;

public class Main {
    public static void main(String[] args) {

        int number = -5;
        int factorial = getFactorial(number);
        System.out.println("Факториал числа " + number + " равен: " + factorial);
    }

    public static int getFactorial(int f) {
        int result = 1;
        if (f < 0) {
            throw new IllegalArgumentException("Факториал можно вычислить только для неотрицательных чисел");
        } else {
            for (int i = 1; i <= f; i++) {
                result = result * i;
            }
        }
        return result;
    }
}