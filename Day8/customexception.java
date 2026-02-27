class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){
        super(msg);
    }
}
public class customexception{
    public static void main(String[] args) {
        try{
            int age=15;
            if(age<18)
                throw new InvalidAgeException("Age must be 18+");
            System.out.println("Eligible");
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}