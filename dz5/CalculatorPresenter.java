package dz5;

import java.util.Scanner;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        Double number1 = view.getUserInput();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите знак(+,-,*,/): ");
        String znak = scanner.nextLine();

        Double number2 = view.getUserInput();

        switch(znak){
            case "+":
                model.add(number1, number2);
                break;
            case "-":
                model.subtract(number1, number2);
                break;
            case "*":
                model.myltiplay(number1, number2);
                break;
            case "/":
                model.divide(number1, number2);
                break;
            default:
                System.out.println("Не коректная операция");
        }
        Double result = model.getResult();

        view.displayResult(result);
    }
}
