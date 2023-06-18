import java.sql.*;
public class FetchRecord
{
	public static void main(String[] args) {
		try{
		
		    // loading driver class
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    
		    // creating connection object
		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","pass");
		    
		    // creating statement object
		    
		    Statement stmt= con.createStatement();
		    
		    // Execute query
            //stmt.executeUpdate("insert into emp765 values(33,'Irfan',50000)");  
            //int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");  
            int result=stmt.executeUpdate("delete from emp765 where id=33");  
            System.out.println(result+" records affected");  
            con.close();
        		    
    		}catch(Exception ee){
    		    System.out.println(ee);
    		}
		
		
		
	}
}
