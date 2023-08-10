package dz6;

public class Main {  
    public static void main(String[] args) {  
        ComplexNumber num1 = new ComplexNumber(2, 3);  
        ComplexNumber num2 = new ComplexNumber(4, 5);  
  
        ComplexCalculator calculator = new ComplexAdditionCalculator();  
        CalculatorLogger logger = new CalculatorLogger("log.txt");  
        CalculatorService calculatorService = new CalculatorService(calculator, logger);  
  
        System.out.println(String.format("Итоговое: %s", calculatorService.calculate(num1, num2)));
       
    }  
}
