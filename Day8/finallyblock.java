public class finallyblock{
    public static void main(String[] args) {
        try {
            int a=10/10;
            System.out.println("executed");
        } 
        catch(Exception e){
            System.out.println("Error occured");
        }
        finally{
            System.out.println("Always Executed");
        }
    }
}