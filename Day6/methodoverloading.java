public class methodoverloading{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        methodoverloading obj=new methodoverloading();
        obj.add(2,3);
        obj.add(2.5,3.5);
    }
    }