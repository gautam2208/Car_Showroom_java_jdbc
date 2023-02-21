package carWaleProgram;

import java.sql.*;

public class CarInfo {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("registered");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			System.out.println("Connected");
			Statement stmt=con.createStatement();
			System.out.println("created");
//			stmt.executeUpdate("insert into carwale.carinfo values(02,'BMW','2028',423000)");
//			stmt.executeUpdate("insert into carwale.carinfo values(03,'Audi','2010',45430000)");
//			stmt.executeUpdate("insert into carwale.carinfo values(5,'pagani','1939',1500000)");			
//			stmt.executeUpdate("insert into employeeinformation.employe values(19,'Bikash','Dev')");			

			
			//			stmt.executeUpdate("update employeeinformation.employe set Eid=02 where Ename='Parag'");
//			stmt.executeUpdate("update employeeinformation.employe set Eid=04 where Ename='Nisarg'");
//			stmt.executeUpdate("update carwale.carinfo set Car-id=03 where Car-price='1232'");
			stmt.executeUpdate("delete from employeeinformation.employe where Eid=19");
			stmt.executeUpdate("delete from carwale.carinfo where Car_id=1");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error");
		}	
		
	}
	

}
