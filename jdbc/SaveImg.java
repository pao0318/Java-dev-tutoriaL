import java.sql.*;
import java.io.*;
public class InsertImage
{
	public static void main(String[] args) {
	    try{
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dbname","pass");
	    PreparedStatement st= con.prepareStatement("insert into img values(?,?)");
	    st.setString(1,"imgname");
	    
	    FileInputStream fin=new FileInputStream("//img path//img.jpg");
	    st.setBinaryStream(2,fin,fin.available());
	    
	    int i=st.executeUpdate();
	    System.out.println(i+" records effected");
	    
	    con.close();
	    } catch(Exception e){e.printStackTrace();}	    }
	    
	    
}
}
