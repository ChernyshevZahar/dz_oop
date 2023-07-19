package dz2;


abstract class Animal {  
    protected int age;  
    protected String name;  
  
    public void Setter(int age, String name){  
        this.name = name;  
        this.age = age;  
    }  
      
    public abstract String Getter();  
}  

interface Greetable {  
    String greet();  
}

class Cat extends Animal implements Greetable {  
      
    public String Getter(){  
        return name + " : " + age;  
    }  
  
    public String greet(){  
        Owner Owner = new Owner("Dima");  
        return String.format("Мяу! Меня зовут %s. Мне %s года(лет). Мой владелец - %s", name, Integer.toString(age), Owner.getowner());  
    }  
} 
