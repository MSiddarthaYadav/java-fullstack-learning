class Parent{
    void display(){
        System.out.println("Parent class");
    }
}
class child1 extends Parent{}
class child2 extends Parent{}

public class hierarchicalinheritance{
    public static void main(String[] args) {
        child1 c1=new child1();
        child2 c2=new child2();
        c1.display();
        c2.display();
    }
}