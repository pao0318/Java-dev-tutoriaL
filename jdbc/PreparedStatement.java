import java.sql.*;
public class PreparedStatement
{
	public static void main(String[] args) {
	    try{
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	        Connection con=DriverManager.getConnection("jdbc:orcale:thin:@localhost:1521:xe","dbname","pass");
	        PreparedStatement stmt=con.PreparedStatement("insert into EMP values(?,?)");
	        stmt.setInt(1,101);// first parameter
	        stmt.setString(2,"Ratan");
	        int i=stmt.executeUpdate();
	        
	        System.out.println(i+ "Records submitted");
	        
	        // Updates Records
	        PreparedStatement st=con.PreparedStatement("update enm set name=? where id=?");
	        st.setString(1,101);
	        int j=executeUpdate();
	        System.out.println(j+ "Records updated");
	        
	       // Deletes Records
	        PreparedStatement st=con.PreparedStatement("delete from emp where id=?");
	        st.setString(1,101);
	        int j=executeUpdate();
	        System.out.println(j+ "Records deleted");	 
	        

	        con.close();
	        
	    }catch(Exception e){ System.out.println(e);} 
        		    
		
	}
}
