public class ClassnotfoundexceptionDemo{
    public static void main(String[] args) {
        try {
            Class.forName("Test Class");
        }
        catch(ClassNotFoundException e){
            System.out.println("Class not found");
        
        }
    }
}