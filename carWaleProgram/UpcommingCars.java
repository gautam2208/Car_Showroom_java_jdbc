package carWaleProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpcommingCars {
public void upcomingCars(Connection con) {
	try {	
		PreparedStatement stmt=con.prepareStatement("Select * from carwale.registered");
		ResultSet res=stmt.executeQuery();
		while(res.next()) {
			System.out.print(res.getInt(1)+" ");
			System.out.print(res.getString(2)+" ");
			System.out.print(res.getString(3)+" ");
			System.out.println(res.getInt(4));
		}
	}
		catch (Exception e) {
			// TODO: handle exception
		}


}
}
