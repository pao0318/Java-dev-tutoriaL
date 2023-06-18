import java.sql.*;
public class FetchRecord
{
	public static void main(String[] args) {
		    // loading driver class
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    
		    // creating connection object
		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pass");
		    
		    // creating statement object
		    Statement stmt= con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		    
            ResultSet rs=stmt.executeQuery("select * from EMP");
            rs.absoulte(3);
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
            con.close();
        		    
		
	}
}
