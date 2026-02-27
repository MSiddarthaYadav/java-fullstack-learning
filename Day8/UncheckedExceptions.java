public class UncheckedExceptions {
    public static void main(String[] args) {
        try{
            int arr[]=new int[5];
            arr[5]=10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of Range");
        } 
    }
}
