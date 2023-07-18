package dz1;

public class Cat {
    private int age;
    private String name;
    

    public String Getter(){
        return name + " : " + age;
    }

    public void Setter(int age, String name){
        this.name = name;
        this.age = age;
    }
    public String greet(){
        Owner Owner = new Owner("Dima");
        return String.format("Мяу! Меня зовут %s . Мне %s года(лет). Мой владелец - %s ", name, Integer. toString(age), Owner.getowner());
    }


}
