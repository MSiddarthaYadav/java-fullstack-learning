enum Laptop{
    DELL(60000),
    HP(55000),
    MAC(120000);
    int price;
    Laptop(int price){
        this.price=price;
    }
    int getprice(){
        return price;
    }
}
public class EnumWithFields{
    public static void main(String[] args) {
        for(Laptop l: Laptop.values()){
            System.out.println(l+ " costs " + l.getprice());
        }
    }
}