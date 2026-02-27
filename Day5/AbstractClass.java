abstract class Vehicle{
    abstract void start();
    void fuel(){
        System.out.println("Fuel added");
    }
}

class Bike extends Vehicle{
    void start(){
        System.out.println("Bike starts");
    }
}
public class AbstractClass{
    public static void main(String[] args) {
        Bike b=new Bike();
        b.fuel();
        b.start();
    }
}
