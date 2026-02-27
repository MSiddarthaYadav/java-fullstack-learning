public class multicatch {
    public static void main(String[] args) {
        try{
            int arr[]=new int[5];
            arr[110]=100;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Error");
            }
        }

}
