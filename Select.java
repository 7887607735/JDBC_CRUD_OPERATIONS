package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch140","root","root");
		Statement st=cc.createStatement();
		
		ResultSet rs=st.executeQuery("select * from Employee");
		System.out.println("Employee Table");
		
		

	}

}
