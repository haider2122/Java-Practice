import java.sql.*;

public class Jdbc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String query="select empno,ename,job,sal,deptno from emp";
		
		
		
		try(Connection con=DriverManager.
getConnection("jdbc:mysql://localhost:3306/sho?useSSL=false","root","password");
				Statement st=con.createStatement();
				
				ResultSet rs= st.executeQuery(query)){
			
			System.out.println("empno	ename	job	sal	deptno");
			System.out.println("");
			while(rs.next()){
				int empno=rs.getInt("empno");
				String ename=rs.getString("ename");
				String job=rs.getString("job");
				int sal=rs.getInt("sal");
				int deptno=rs.getInt("deptno");
				System.out.println(empno+"	"+ename+"	"+job+"	"+sal+"	"+deptno);
				
			}
			
			
		}catch(SQLException e){
			System.out.println(e);
			
		}		
		
		
		
		
		
		
		
		
	}

}
