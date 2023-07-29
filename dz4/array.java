package dz4;

import java.util.List;

public class array<T> {
    List<T> arr;

    public array(List<T> arr){
        this.arr = arr;
    }

    public void printArray(){
        for(T ob : arr){
            System.out.println(ob);
        }
    }
}
