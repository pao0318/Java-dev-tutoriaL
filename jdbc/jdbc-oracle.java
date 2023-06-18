import java.sql.*;
public class Main
{
	public static void main(String[] args) {
		try{
		    // loading driver class
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    
		    // creating connection object
		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pao0318");
		    
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
