package carWaleProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Buy {
public void buyCars(Connection con) {
	
	PreparedStatement pstmt = null;

	String qry ="delete from carwale.carinfo where Car_id=?";

	try {

        PreparedStatement stmt=con.prepareStatement("Select * from carwale.carinfo");
		ResultSet res=stmt.executeQuery();
		while(res.next()) {
			System.out.print(res.getInt(1)+" ");
			System.out.print(res.getString(2)+" ");
			System.out.print(res.getString(3)+" ");
			System.out.println(res.getInt(4));
		}
		pstmt = con.prepareStatement(qry);
		Scanner sc=new Scanner(System.in);
		System.out.println("===============Enter id===============");
		int a=sc.nextInt();
		
		pstmt.setInt(1, a);
		
		
		
		pstmt.executeUpdate();
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
