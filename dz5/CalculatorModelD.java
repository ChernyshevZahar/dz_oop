package dz5;

//Принцип разделения интерфейса - Разбиение наболее мелкие интерфейсы для исключения не нужных функции

interface Funcadd<T>{
    void add(T number1, T number2);
}

interface Funcsubtract<T>{
    void subtract(T number1, T number2);
}

interface Funcdivide<T>{
    void divide(T number1, T number2);
}

interface Funcmyltiplay<T>{
    void myltiplay(T number1, T number2);
}

public class CalculatorModelD implements Funcadd<Double> ,Funcsubtract<Double>, Funcdivide<Double>,  Funcmyltiplay<Double>  {
    private Double result;

    @Override
    public void add(Double number1, Double number2) {
        result = number1 + number2;
    }

    @Override
    public void subtract(Double number1, Double number2) {
    result = number1 - number2;
    }

    @Override
    public void divide(Double number1, Double number2) {
        if(number2 != 0){
            result = number1 / number2;
        }else{
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
    
    }
    @Override
    public void myltiplay(Double number1, Double number2) {
        result = number1 * number2;
    }

    
    public Double getResult() {
        return result;
    }
}


   