import java.sql.*;
import java.io.*;
public class FetchImage
{
	public static void main(String[] args) {
	    try{
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dbname","pass");
	    
	    
	    PreparedStatement st= con.prepareStatement("select * from imgtable");
	    ResultSet rs=st.executeQuery();
	    
	    if(rs.next()){ // on 1st row
	        Blob b=rs.getBlob(2) // 2nd column data
	        byte barr[]=b.getBytes(1, int(b.length())); // 1st image
	        
	        FileOutputStream fout= new FileOutputStream("//saveimgpath//output.jpg") // saves image
	        fout.write(barr);
	        
	    }
	    System.out.println("ok");
	    
	    con.close();
	    } catch(Exception e){e.printStackTrace();}	    }
	    
	    
}
}
