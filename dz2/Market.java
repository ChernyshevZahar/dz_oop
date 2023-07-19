package dz2;

import java.util.ArrayList;
import java.util.List;

interface QueueBehaviour {  
    String dequeue(int pers);  
    int size();  
}  

interface MarketBehaviour {  
    void addPerson(String person);  
    void removePerson(String person);  
    void update();  
}



public class Market implements QueueBehaviour,MarketBehaviour {
    private List<String> queue;  
  
    public Market() {  
        queue = new ArrayList<>();  
    } 
  
    public String dequeue(int pers) {  
        if (!queue.isEmpty()) {  
            return queue.remove(pers);  
        } else {  
            return null;  
        }  
    }  
  
    public int size() {  
        return queue.size();  
    }  
  
    public void addPerson(String person) {  
        queue.add(person); 
    }  
  
    public void removePerson(String person) {  
        queue.remove(person);  
    }  
  
    public void update() {  
        System.out.println("Updating market state...");   
    }  
  
}
