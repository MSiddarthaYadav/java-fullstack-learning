
class A{
    void showA(){
        System.out.println("class A");
    }
}
class B extends A{
    void showB(){
        System.out.println("class B");
    }
}
class C extends B{
    void showC(){
        System.out.println("class C");
    }
}
public class multilevelinheritance{
    public static void main(String[] args) {
        C obj=new C();
        obj.showA();
        obj.showB();
        obj.showC();
    }
}