package carWaleProgram;

import java.sql.*;
import java.util.Scanner;

public class ViewRegister {
	Scanner sc=new Scanner(System.in);
	public void view(Connection con) {
		try {
			
	        PreparedStatement stmt=con.prepareStatement("Select * from carwale.carinfo");
			ResultSet res=stmt.executeQuery();
			while(res.next()) {
				System.out.print(res.getInt(1)+" ");
				System.out.print(res.getString(2)+" ");
				System.out.print(res.getString(3)+" ");
				System.out.println(res.getInt(4));
			}
			PreparedStatement pstmt=con.prepareStatement("insert into carwale.registered(Rname,Remail,Rnumber) values(?,?,?)");
			System.out.println("===============Enter name===============");
			String Rname=sc.next();
			System.out.println("===============Enter email===============");
			String Remail=sc.next();
			System.out.println("===============Enter number===============");
			int Rnumber=sc.nextInt();
		
			pstmt.setString(1, Rname);
			pstmt.setString(2, Remail);
			pstmt.setInt(3, Rnumber);
			
			int res1=pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
