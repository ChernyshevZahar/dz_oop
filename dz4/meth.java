package dz4;

public class meth<T> {
    
    T ob;

    public meth(T ob){
        this.ob = ob;
    }

    public T seeelem(){
        return ob;
    }

    public void printElement(){
        System.out.println(ob);
    }


}
