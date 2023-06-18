import java.sql.*;
public class noDSN
{
	public static void main(String[] args) {
		try{
		    
		    // current directory me database hai
		    String database = "pao.mdb";
		    
		    String url= "jdbc:odbc:Driver={Microsoft Access Driver(*.mdb)};
		                DBQ="+ database+ ";DriverID=22;ReadOnly=true";
		    ";
		    
		    // loading driver class
		    Class.forName("sun.jdbc.obdc.JdbcOdbcDriver");
		    
		    // creating connection object
		    Connection c=DriverManager.getConnection("url");
		    
		    // creating statement object
		    
		    Statement stmt= c.createStatement();
		    
		    // Execute query
		    ResultSet rs=stmt.executeQuery("select * from login");
		    
		    while(rs.next())  
                System.out.println(rs.getInt(1));
            
            // Close connection
            con.close();
		    
		}catch(Exception ee){
		    System.out.println(ee);
		}
		
		
		
	}
}
