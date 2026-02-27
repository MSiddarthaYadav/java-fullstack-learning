abstract class Vehicle{
    abstract void starts();
    void fuel(){
        System.out.println("Fuel added");
}
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike Starts");
    }
}
public class abstractionc{
    public static void main(String[] args) {
        Bike b=new Bike();
        b.fuel();
        b.start();
    }
}