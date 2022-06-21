package com.jdbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {
    	
    	Employee emp=new Employee();
    	 Scanner sc=new Scanner(System.in);


    	Class.forName("com.mysql.cj.jdbc.Driver");
	
		String url="jdbc:mysql://localhost:3306/laerdal_assignment";
		String username="root";
		String password="password";
	
	Connection con=DriverManager.getConnection(url,username,password);
 
	Statement st=con.createStatement();
	
	
	while(true){
	
		
		System.out.println("i to insert, d to delete and p to print");
		String input=sc.next();
		
		
	if(input.equals("p")){
		
String query="SELECT * FROM Emp";
ResultSet rs= st.executeQuery(query);




while(rs.next()){
emp.setId(rs.getInt(1));

emp.setName(rs.getString(2));
emp.setSal(rs.getInt(3));

System.out.println(emp);


}
	}


	
	
if(input.equals("i")){
	String query="insert into Emp values(?,?,?)";
	System.out.println("Enter Id");
	emp.setId(sc.nextInt());
	System.out.println("Enter Name");
	emp.setName(sc.next());
	System.out.println("Enter Salary");
	emp.setSal(sc.nextInt());
	
	PreparedStatement ps=con.prepareStatement(query);
	ps.setInt(1, emp.getId());
	ps.setString(2, emp.getName());
	ps.setInt(3, emp.getSal());
	
	
	
	System.out.println("Rows affected: "+ps.executeUpdate());
	System.out.println("Inserted Values:"+emp);
}


if(input.equals("d")){
	String query="delete from Emp where empid=?";
	
	System.out.println("Enter Id");
	emp.setId(sc.nextInt());
	
	
	PreparedStatement ps=con.prepareStatement(query);
	ps.setInt(1, emp.getId());

	
	
	System.out.println("Rows affected: "+ps.executeUpdate());

}

		
		
if(input.equals("u")){
	String query="update Emp e SET e.name=?, e.sal=? where e.empid=?";
	
	System.out.println("Enter Id");
	emp.setId(sc.nextInt());
	
	System.out.println("Enter Name");
	emp.setName(sc.next());
	
	System.out.println("Enter al");
	emp.setSal(sc.nextInt());
	
	
	PreparedStatement ps=con.prepareStatement(query);
	ps.setInt(1, emp.getId());
	ps.setString(2, emp.getName());
	ps.setInt(3, emp.getSal());
	
	System.out.println("Rows affected: "+ps.executeUpdate());
	System.out.println("Updates Employee"+emp);
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	System.out.println("press e to exit");
	
	String val=sc.next();
	if(val.equals("e")){
		break;
	}
    
	
	
	}
	
	
	
	}
}
