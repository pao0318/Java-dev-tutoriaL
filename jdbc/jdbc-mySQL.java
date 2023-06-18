import java.sql.*;
public class Main
{
	public static void main(String[] args) {
		try{
		    // loading driver class
		    Class.forName("com.mysql.jdbc.Driver");
		    
		    // creating connection object
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/root/password");
		    
		    // creating statement object
		    
		    Statement stmt= con.createStatement();
		    
		    // Execute query
		    ResultSet rs=stmt.executeQuery("select * from EMP");
		    
		    while(rs.next())  
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            
            // Close connection
            con.close();
		    
		}catch(Exception e){
		    System.out.println(e);
		}
		
		
		
	}
}
