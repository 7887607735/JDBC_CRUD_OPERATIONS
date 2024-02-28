import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDelete {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch140","root","root");
		PreparedStatement st=cc.prepareStatement("Delete from student where id=?");
		st.setInt(1,45);
		st.executeUpdate();
		
		st.setInt(1, 56);
		st.executeUpdate();
		System.out.println("Record deleted");
		
		
				

	}

}
