package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
	
	public static void main(String[] args) throws Exception		{
	Class.forName("com.mysql.jdbc.Driver");
		 Connection cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch140","root","root");
		 Statement st=cc.createStatement();
		 
		 st.execute("insert into student values(4,'ASP')");

		 

		 
	 System.out.println("Record inserted");
	
		
}


	
	}




