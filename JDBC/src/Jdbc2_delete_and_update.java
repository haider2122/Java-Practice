import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2_delete_and_update {

	public static void main(String[] args) {
String query="DELETE FROM emp WHERE ename=\"Johnny\"";
		
		
		
		try(Connection con=DriverManager.
getConnection("jdbc:mysql://localhost:3306/sho?useSSL=false","root","password");
				Statement st=con.createStatement();){
			int result= st.executeUpdate(query);
			
			System.out.println("Numbers of Row/s Affected: "+result);
//			while(rs.next()){
//				int empno=rs.getInt("empno");
//				String ename=rs.getString("ename");
//				String job=rs.getString("job");
//				int sal=rs.getInt("sal");
//				int deptno=rs.getInt("deptno");
//				System.out.println(empno+"	"+ename+"	"+job+"	"+sal+"	"+deptno);
//				
//			}
			
			
		}catch(SQLException e){
			System.out.println(e);
			
		}		
		
		// TODO Auto-generated method stub

	}

}
