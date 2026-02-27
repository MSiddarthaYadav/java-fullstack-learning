class Parent{
    void display(){
        System.out.println("Parent class");
    }
}

class Child1 extends Parent{}
class Child2 extends Parent{}

public class hierarchicalInheritance{
    public static void main(String[] args) {
        Child1 c1=new Child1();
        Child2 c2=new Child2();
        c1.display();
        c2.display();
    }
}