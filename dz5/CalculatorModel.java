package dz5;

public class CalculatorModel {
    private Double result;

    public void add(Double number1, Double number2) {
        result = number1 + number2;
    }

    public void subtract(Double number1, Double number2) {
    result = number1 - number2;
    }

    public void divide(Double number1, Double number2) {
        if(number2 != 0){
            result = number1 / number2;
        }else{
            throw new IllegalArgumentException("На ноль делить нельзя");
        }
    
    }
    public void myltiplay(Double number1, Double number2) {
        result = number1 * number2;
    }


    public Double getResult() {
        return result;
    }
}
