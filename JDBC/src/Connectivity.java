import java.sql.*;
import java.sql.DriverManager;

public class Connectivity {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Hello");	
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/sys";
		String username="root";
		String password="password";
	
	Connection con=DriverManager.getConnection(url,username,password);
 
	Statement st=con.createStatement();
	
	String query="SELECT * FROM employee";
	ResultSet rs= st.executeQuery(query);
	while(rs.next()){
	int empno=rs.getInt(1);
	String namex=rs.getString(2);
	String job=rs.getString(3);
	System.out.println(empno+" "+namex+" "+job);
	
	
	}
	rs.close();
	st.close();
	con.close();

		
	
	}
}
