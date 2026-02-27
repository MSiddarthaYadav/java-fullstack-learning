class accessmodifiers{
    public int a=10;
    private int b=20;
    int c=30;
    protected int d=40;

    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public static void main(String[] args) {
        accessmodifiers obj=new accessmodifiers();
        obj.display();
    }
}