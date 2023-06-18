import java.sql.*;
import java.io.8;
public class RS
{
	public static void main(String[] args) {
	    Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dbname","pass");
	    PreparedStatement st= con.prepareStatement("insert into EMP values(?,?,?)");
	    
	    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    
	    do{
	        System.out.println("enter id:");
	        int id= Integer.parseInt(br.readLine());
	        System.out.println("enter name:");
	        String name =br.readLine();
	        System.out.println("enter salary:");
	        float sal= Float.parseFloat(br.readLine());
	        
	        st.setInt(1,id);
	        st.setString(2,name);
	        st.setFloat(3,salary);
	        
	        int i=st.executeUpdate();
	        
	        System.out.println("if you want to continue y/n");
	        char c= br.readLine().charAt(0);
	        if(c=='n'){
	            break;
	        }
	    }while(true);
}
}
