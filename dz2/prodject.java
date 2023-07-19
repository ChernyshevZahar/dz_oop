package dz2;

public class prodject {
    public static void main(String[] args) {
        // Cat Cat = new Cat();
        // Cat.Setter(10, "Wasia");
        // System.out.println(Cat.greet());

        Market market = new Market();  
        market.addPerson("Person1");  
        market.addPerson("Person2");  
        market.addPerson("Person3");  
  
        System.out.println(market.dequeue(2));  
  
        market.removePerson("Person2");  
  
        System.out.println(market.size()); 
  
        market.update();  
    }  

}
