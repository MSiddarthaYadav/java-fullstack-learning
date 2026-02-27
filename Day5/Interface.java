interface Payment{
    void pay();
}
class UPI implements Payment{
    public void pay(){
        System.out.println("Payemnt via UPI");
    }
}

public class Interface{
    public static void main(String[] args) {
        Payment p=new UPI();
        p.pay();
    }
}