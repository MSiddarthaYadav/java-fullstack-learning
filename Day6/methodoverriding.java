class parent{
    void show(){
        System.out.println("parent class");
    }
}
class child extends parent{
    void show(){
        System.out.println("child class");
    }
}
public class methodoverriding{
    public static void main(String[] args) {
        parent p=new child();
        p.show();
    }
}