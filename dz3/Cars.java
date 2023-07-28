package dz3;

interface Price<T>{
    T getNowPrice(T a, T b);
}

public class Cars implements Comparable<Cars> {
    protected String model;
    protected int age;
    protected int price;

    public Cars(String model, int age, int price){
        this.age = age;
        this.model = model;
        this.price = price;
    }

    public int getAge(){
       return age;     
    }
    public int getPrice(){
       return price;     
    }

    public String getModel(){
       return model;     
    } 

    public String GetCar(){
        return String.format("Модель: %s, Возраст: %d, Цена: %d", model, age, price);
    }

    @Override
    public int compareTo(Cars overCars){
        return this.age - overCars.age;
    }

    
    
    

    


}
