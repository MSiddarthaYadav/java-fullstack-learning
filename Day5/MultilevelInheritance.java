class A{
    void showA(){
        System.out.println("CLASS A");
    }
}

class B extends A{
    void showB(){
        System.out.println("CLASS B");
    }
}

class C extends B{
    void showC(){
        System.out.println("CLASS C");
    }
}

public class MultilevelInheritance{
    public static void main(String[] args) {
        C obj=new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}