public class Variabletypes{
    int instanceVar=10;
    static int staticVar=20;
    public void show() {
        int localVar=30;
        System.out.println("Local variable:"+localVar);
        System.out.println("Instance variable:"+instanceVar);
        System.out.println("Static variable:"+staticVar);
    }
    public static void main(String[] args) {
        Variabletypes obj=new Variabletypes();
        obj.show();
    }

}