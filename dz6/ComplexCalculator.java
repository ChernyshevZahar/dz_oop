package dz6;


interface ComplexCalculator {  
    ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2);  
}  

    /**
    * Метод позволяет сложить два комплексных числа и вернуть результат в виде нового комплексного числа.
    * 
    * @param num1 Первая пара чисел
    * @param num2 Вторая пара чисел
    * @return при вызове метода calculate(num1,num2) возвращает сложение комплексного числа
    * 
    */
  
class ComplexAdditionCalculator implements ComplexCalculator {  

    /**
    * @param num1 Первая пара чисел
    * @param num2 Вторая пара чисел
    * @return возврашает сложениие комплексного числа
    * 
    */

    @Override  
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {  
        double real = num1.getReal() + num2.getReal();  
        double imaginary = num1.getImaginary() + num2.getImaginary();  
        return new ComplexNumber(real, imaginary);  
    }  
}  

    /**
    * Метод позволяет перемножить два комплексных числа и вернуть результат в виде нового комплексного числа.
    * 
    * @param num1 Первая пара чисел
    * @param num2 Вторая пара чисел
    * @return при вызове метода calculate(num1,num2) возвращает умножение комплексного числа
    * 
    */
  
class ComplexMultiplicationCalculator implements ComplexCalculator {  


    @Override  
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {  
        double real = (num1.getReal() * num2.getReal()) - (num1.getImaginary() * num2.getImaginary());  
        double imaginary = (num1.getReal() * num2.getImaginary()) + (num1.getImaginary() * num2.getReal());  
        return new ComplexNumber(real, imaginary);  
    }    
}  

    /**
    * Метод позволяет поделить два комплексных числа и вернуть результат в виде нового комплексного числа.
    * 
    * @param num1 Первая пара чисел
    * @param num2 Вторая пара чисел
    * @return при вызове метода calculate(num1,num2) возвращает деление комплексного числа
    * 
    */
  
class ComplexDivisionCalculator implements ComplexCalculator { 
    
    @Override  
    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {  
        // Вычисляем знаменатель  
        double denominator = Math.pow(num2.getReal(), 2) + Math.pow(num2.getImaginary(), 2);  
  
        // Вычисляем числитель  
        double real = ((num1.getReal() * num2.getReal()) + (num1.getImaginary() * num2.getImaginary())) / denominator;  
        double imaginary = ((num1.getImaginary() * num2.getReal()) - (num1.getReal() * num2.getImaginary())) / denominator;  
  
        return new ComplexNumber(real, imaginary);  
    }  
}  
