package dz3;

interface Price<T>{
    T getNowPrice(T a, T b);
}

// abstract class Cars implements Comparable<Cars>{
//     protected String model;
//     protected int age;
//     protected int price;

//     public Cars(String model, int age, int price){
//         this.age = age;
//         this.model = model;
//         this.price = price;
//     }

//     public int getAge(){
//        return age;     
//     }
//     public int getPrice(){
//        return price;     
//     }

//     public String getModel(){
//        return model;     
//     } 

//     public String GetCar(){
//         return String.format("Модель: %s, Возраст: %d, Цена: %d", model, age, price);
//     }

//     @Override
//     public int compareTo(Cars overCars){
//         return this.age - overCars.age;
//     }

// }


//Принцип открытости/закрытости - для возможности добавления разный видов машин
interface Car {  
    String getModel();  
    int getAge();  
    int getPrice();  
    String GetCar();
}  
  
class Sedan implements Car , Comparable<Sedan>{  
    private String model;  
    private int age;  
    private int price;  
    
    public Sedan(String model, int age, int price) {  
        this.model = model;  
        this.age = age;  
        this.price = price;  
    }  
    
    @Override  
    public String getModel() {  
        return model;  
    }  
    
    @Override  
    public int getAge() {  
        return age;  
    }  
    
    @Override  
    public int getPrice() {  
        return price;  
    }  
    
    @Override
    public int compareTo(Sedan overCars){
        return this.age - overCars.age;
    } 

    @Override
    public String GetCar(){
        return String.format("Модель: %s, Возраст: %d, Цена: %d", model, age, price);
    }
     
}  
  
class SUV implements Car {  
    private String model;  
    private int age;  
    private int price;  
    
    public SUV(String model, int age, int price) {  
        this.model = model;  
        this.age = age;  
        this.price = price;  
    }  
    
    @Override  
    public String getModel() {  
        return model;  
    }  
    
    @Override  
    public int getAge() {  
        return age;  
    }  
    
    @Override  
    public int getPrice() {  
        return price;  
    }   

    @Override
    public String GetCar(){
        return String.format("Модель: %s, Возраст: %d, Цена: %d", model, age, price);
    }
    
    // Дополнительные методы для SUV  
     
}  