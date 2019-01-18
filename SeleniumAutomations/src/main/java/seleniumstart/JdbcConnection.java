package seleniumstart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class JdbcConnection {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//		try {
//			getConnection();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();

				selectQuery();

	}

	public static Connection getConnection() throws Exception {
		String driver = "com.mysql.jdbc.Driver";
		String ip = "jdbc:mysql://<IP>:3306/<DB-Name>";
		String username = "<Username>";
		String password = "<Password>";
		Class.forName(driver);

		Connection con = DriverManager.getConnection(ip, username, password);
		System.out.println("Worked so far");
		return con;
	}
	
	public static ArrayList<String> selectQuery() throws Exception {
		
		try{ 
			Connection con = getConnection();
		PreparedStatement select = con.prepareStatement("SELECT otp from cs_otp where mobile=9971471811 LIMIT 1");
		ResultSet result=select.executeQuery();
		ArrayList<String> array=new ArrayList<String>(	);
		while (result.next()) {
			System.out.println(result.getString("otp"));
			array.add(result.getString("otp"));			
		}
		return array;
				}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
