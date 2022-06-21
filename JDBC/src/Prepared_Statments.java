import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

//Inserting, creating and updating using prepared statements.
public class Prepared_Statments {

	public static void main(String[] args) {
String query="Insert into dept(deptno,dname,loc) values(?,?,?)";
		
		
		
		try(Connection con=DriverManager.
getConnection("jdbc:mysql://localhost:3306/sho?useSSL=false","root","password");
				PreparedStatement ps=con.prepareStatement(query)){

			ps.setInt(1, 60);
			ps.setString(2, "DB");
			ps.setString(3, "Helsinki");
			
			System.out.println("Our PS query: "+ps);
			System.out.println("Rows affected: "+ps.executeUpdate());
			
			
			
			
		}catch(SQLException e){
			System.out.println(e);
			
		}		
		
		
		
	}

}
