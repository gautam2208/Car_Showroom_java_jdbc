package carWaleProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Sell {
	public void sellCars(Connection con) {

		PreparedStatement pstmt = null;

		String qry = "insert into carwale.carinfo (Car-name, Car-model, Car-price) values(?,?,?)";

		try {

			pstmt = con.prepareStatement(qry);
			Scanner sc = new Scanner(System.in);
			System.out.println("===============Enter car brand===============");
			String b = sc.next();
			System.out.println("===============Enter car model===============");
			String c = sc.next();
			System.out.println("===============Enter car price===============");
			int d = sc.nextInt();
			
			pstmt.setString(1, b);
			pstmt.setString(2, c);
			pstmt.setInt(3, d);

			pstmt.executeUpdate();
			System.out.println("===============TRANSACTION COMPLETED===================");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
