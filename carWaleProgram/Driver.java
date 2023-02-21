package carWaleProgram;

import java.sql.Connection;
import java.sql.DriverManager;

public class Driver {
	static{
		System.out.println("===============WELCOME TO MY SHOWROOM===============");
	}
	
	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con =DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Input.input(con);
	}
}
