import java.sql.SQLException;
public class SQLexceptionDemo{
    public static void main(String[] args){
        try{
            throw new SQLException("Database error");
        }
        catch(SQLException e){
            System.out.println("SQL Exception occured");
        }
    }
}