import java.sql.*;
public class PreparedStatement
{
	public static void main(String[] args) {
	    try{
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con=DriverManager.getConnection("jdbc:orcale:thin:@localhost:1521:xe","dbname","pass");
	        Statement stmt=con.PreparedStatement("insert into EMP values(?,?)");
	        stmt.setInt(1,101);// first parameter
	        stmt.setString(2,"Ratan");
	        int i=stmt.executeUpdate();
	        
	        System.out.println(i+ "Records suubmitted");
	        con.close();
	        
	    }catch(Exception e){ System.out.println(e);} 
        		    
		
	}
}
