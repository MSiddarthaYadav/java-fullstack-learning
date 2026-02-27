class MathOperation{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
public class methodoverloading{
    public static void main(String[]args){
        MathOperation m1=new MathOperation();
        System.out.println(m1.add(2,3));
        System.out.println(m1.add(2,3,4));
    }
}