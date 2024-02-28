import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedInsert {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		PreparedStatement st=cc.prepareStatement("insert into student values(?,?)");
		st.setInt(1, 56);
		st.setString(2, "mnb");
		st.executeUpdate();

		
		st.setInt(1, 45);
		st.setString(2, "rty");
		st.executeUpdate();
		
		System.out.println("Inserted record");
		
		
		

	}

	
	
}
