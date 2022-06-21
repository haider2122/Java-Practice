import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prepared_Statements2 {

	public static void main(String[] args) {
String query="SELECT e.deptno, e.ename,d.loc FROM emp e "
		+ "JOIN dept d "
		+ "ON e.deptno=d.deptno "
		+ "WHERE d.loc=?";
		
		try(Connection con=DriverManager.
getConnection("jdbc:mysql://localhost:3306/sho?useSSL=false","root","password");
				PreparedStatement ps=con.prepareStatement(query)){

			ps.setString(1, "DALLAS");
			
			
			System.out.println("Our PS query: "+ps);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				int deptno=rs.getInt(1);
				String dname=rs.getString(2);
				String loc= rs.getString(3);
				System.out.println(deptno+" "+dname+" "+loc);
			}
			
			
		}catch(SQLException e){
			System.out.println(e);
			
		}		
		

	}

}
