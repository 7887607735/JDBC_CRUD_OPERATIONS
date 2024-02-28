import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedUpdate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cc=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch140","root","root");
		PreparedStatement st=cc.prepareStatement("update student set name=? where id=?");
		st.setString(1, "ADH");
		st.setInt(2, 4);
		st.executeUpdate();
		
		st.setInt(2, 345);
		st.setString(1, "Rutuja");
		st.executeUpdate();

		System.out.println("Record updated");
		

	}

}
