package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
	

	Class.forName("com.mysql.jdbc.Driver");
	 Connection cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch140","root","root");
	 Statement st=cc.createStatement();
	 st.execute("delete from student where id=345");
	 System.out.println("Record deleted");
}

	
	}


