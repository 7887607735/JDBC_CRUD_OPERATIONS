package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
		
			Class.forName("com.mysql.jdbc.Driver");
			 Connection cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch140","root","root");
			 Statement st=cc.createStatement();
			 st.execute("update student set name='PQR' where id=111");
			 System.out.println("Record updated");
		}
		
			
		}

	


