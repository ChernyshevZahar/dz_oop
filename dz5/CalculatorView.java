package dz5;

import java.util.Scanner;

public class CalculatorView {
    public void displayResult(Double result) {
        System.out.println("Результат: " + result);
    }

    public Double getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        Double input = scanner.nextDouble();
        return input;
    }
}
