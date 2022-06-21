import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class Batch_Statements {

	public static void main(String[] args) {

				try(Connection con=DriverManager.
		getConnection("jdbc:mysql://localhost:3306/sho?useSSL=false","root","password");
			Statement st=con.createStatement()){
					
					con.setAutoCommit(false);
					
					st.addBatch("Insert into dept VALUES(70,\"Finance\",\"Tokyo\")");
					st.addBatch("Insert into dept VALUES(80,\"HR-IT\",\"Bombay\")");
					st.addBatch("Insert into dept VALUES(90,\"MS Services\",\"California\")");
				
					st.addBatch("Delete from dept Where deptno=60");
					
					System.out.println("---------------rows affected--------------------");
					for(int i:st.executeBatch()){
						System.out.println("Rows Affects:"+i);
					}
					con.commit();
				
				}catch(SQLException e){
					System.out.println(e);
					
				}		
	}

}
