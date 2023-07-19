package dz2;



public class Owner extends AbsOwner {
    private String owner;

    public Owner(String owner){
        this.owner = owner;
    }

    public String getowner(){
        return owner;
    }

    public void Stat(){
        System.out.println("Start program");
    }
}

abstract class AbsOwner {
    public abstract void Stat();
}
