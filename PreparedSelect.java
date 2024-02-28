import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch140","root","root");
		
		PreparedStatement st=cc.prepareStatement("Select * from Student");
		
		ResultSet rs=st.executeQuery();
		System.out.println("Student table");
		
		
	}

}
