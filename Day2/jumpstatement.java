public class jumpstatement{
    public static void main(String[]args){

//break statement
        for(int i=0;i<9;i++){
            if(i==5){
                break;
            }
            System.out.println("break statement i = "  +  i);
        }


//continue statement
        for(int j=1;j<=6;j++)
        {
            if(j==4){
                continue;
              } 
              System.out.println("continue statement j= "  +  j);
            }
        
        
        
//return statement
            System.out.println("return statement");
            return;
    }
 }


