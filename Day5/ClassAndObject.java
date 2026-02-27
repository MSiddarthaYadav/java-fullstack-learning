class Car {
    String brand;

    void drive() {
        System.out.println("Car is driving");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "BMW";
        c.drive();
    }
}
