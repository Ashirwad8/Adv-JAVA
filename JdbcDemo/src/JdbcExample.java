import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcExample {



	public static void main(String args[]) {
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo","root","");
			System.out.println(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
