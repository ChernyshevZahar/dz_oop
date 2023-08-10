package dz6;

/**
     * Kласс CalculatorService обеспечивает единый интерфейс для использования различных калькуляторов в рамках одного сервиса.
     * @param calculator экземпляр вычесления (ComplexAdditionCalculator, ComplexMultiplicationCalculator, ComplexDivisionCalculator)
     * @param logger класса логирования
     */

public class CalculatorService {  
    private ComplexCalculator calculator;  
    private CalculatorLogger logger;  
  
    /**
     * Kласс CalculatorService обеспечивает единый интерфейс для использования различных калькуляторов в рамках одного сервиса.
     * @param calculator экземпляр вычесления (ComplexAdditionCalculator, ComplexMultiplicationCalculator, ComplexDivisionCalculator)
     * @param logger класса логирования
     */

    public CalculatorService(ComplexCalculator calculator, CalculatorLogger logger) {  
        this.calculator = calculator;  
        this.logger = logger;  
    }  

    /**
     * 
     * @param num1 Первая пара чисел
     * @param num2 Вторая пара чисел
     * @return Возврашает результат комплексных чисел исходя из переданного в calculatorService класса вычесления
     */
  
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {  
        ComplexNumber result = calculator.calculate(num1, num2);  
        logger.log("Result: " + result);  
        return result;  
    }  
}
