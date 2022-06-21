import java.sql.*;
import java.util.Arrays;
import java.util.*;
public class Batch_PreparedStatements {
	public static void main(String [] args){
		
		String query1="Insert into dept Values(?,?,?)";
		String query2="Update dept SET loc=? WHERE loc=? OR loc=?";
		String query3="Select * from dept";
		
		
		try(Connection con=DriverManager.
				getConnection("jdbc:mysql://localhost:3306/sho?useSSL=false","root","password");
				PreparedStatement ps1=con.prepareStatement(query1);
				PreparedStatement ps2=con.prepareStatement(query2);
				PreparedStatement ps3=con.prepareStatement(query3)){
			con.setAutoCommit(false);
			
			
			ps1.setInt(1,60);
			ps1.setString(2,"HeadOff");
			ps1.setString(3, "New York");
			ps1.addBatch();
			ps1.setInt(1,70);
			ps1.setString(2,"CC");
			ps1.setString(3, "Egypt");
			ps1.addBatch();
			
			
			ps2.setString(1,"NEW YORK");
			ps2.setString(2,"NY");
			ps2.setString(3,"New York");
			ps1.addBatch();
			
			int [] a1=ps1.executeBatch();
			int [] a2=ps1.executeBatch();
			System.out.println("Rows Affected: "+Arrays.toString(a1));
			System.out.println("Rows Affected: "+Arrays.toString(a2));
			con.commit();
			
			ResultSet rs=ps3.executeQuery();
			while(rs.next()){
				int x=rs.getInt(1);
				String y=rs.getString(2);
				String z=rs.getString(3);
				System.out.println(x+"	"+y+"	"+"	"+z);
			}
			
		
		}catch(SQLException e){
			System.out.println(e);
			
		}		
		
	}

}
