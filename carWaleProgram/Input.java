package carWaleProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Input {

	public static void input(Connection con) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"SELECT 1:- View and Register\nSELECT 2:- Sell Car\nSELECT 3:- Buy Car\nSELECT 4:- Upcoming cars");
		int input = sc.nextInt();
		switch (input) {
		case 1: {

			ViewRegister vR = new ViewRegister();
			vR.view(con);
			break;
		}
		case 2: {

			Sell s = new Sell();
			s.sellCars(con);
			break;
		}
		case 3: {

			Buy b = new Buy();
			b.buyCars(con);
			break;
		}
		case 4: {

			UpcommingCars uc = new UpcommingCars();
			uc.upcomingCars(con);
			break;
		}
		default:
			System.out.println("====================INVALID OPTION=====================");
			input(con);
		}
	}

}
