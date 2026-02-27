public class Operators{
    public static void main(String[] args) {

 //Arithmetic Operators
        int a=10;
        int b=20;
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    
//Relational or Comparision Operators
        int c = 10; 
        int d = 20;
        System.out.println("\n--- Relational Operators ---");
        System.out.println(c == d); 
        System.out.println(c != d); 
        System.out.println(c > d);
        System.out.println(c < d);  
        System.out.println(c >= d); 
        System.out.println(c <= d); 

//Logical Operators
        int e=10;
        int f=20;
        int g=30;
        int h=40;
        System.out.println("\n--- Logical Operators ---");
        System.out.println(e<f && g<h);
        System.out.println(e<f || g<h);
        System.out.println(!(e<f));


//Assignment Operators
        int i=10;
        int j=20;
        int k=30;
        int l=40;
        int m=50;
        i+=5;
        j-=5;
        k*=5;
        l/=5;
        m%=5;
        System.out.println("\n--- Assignment Operators ---");
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

//Unary Operators
        int n=10;
        int o=20;
        n++;
        o--;   
        System.out.println("\n--- Unary Operators ---");
        System.out.println(n);
        System.out.println(o);

//Turnary Operators
        int age=17;
        String x=(age>=18)?"Eligible":"Not Eligible";
        System.out.println("\n--- Turnary Operators ---");
        System.out.println(x);
    


    }

}