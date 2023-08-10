package dz6;




public class ComplexNumber {  
    private double real;  
    private double imaginary; 
    
    /**
     * метод для работы с комплексными числами и хранения их значения.
     * @param real вещественная часть комплексной переменной
     * @param imaginary мнимая часть комплексной переменной
     */
  
    public ComplexNumber(double real, double imaginary) {  
        this.real = real;  
        this.imaginary = imaginary;  
    }  

    /**
    * @return возвращает вещественную часть комплексной переменной
    */
  
    public double getReal() {  
        return real;  
    }  
  

    /**
    * @return возвращает мнимую часть комплексной переменной
    */
    public double getImaginary() {  
        
        return imaginary;  
    }  

    /**
     * 
     * переопределяем метод toString(), чтобы получить строковое представление комплексного числа
     * 
     */
  
    @Override  
    public String toString() {  
        return real + " + " + imaginary + "i";  
    }  
}  
