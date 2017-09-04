package geeky.jdbc;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Choose an action: 1.Create Table \n 2.Add a new student \n 3.List of all students");
		String inputid = scan.nextLine();
		switch (inputid){
		case "1" : JDBC_Connect.createTable();
		break;
		case "2" : Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String surname = s.nextLine();
			JDBC_Connect.addNew(facnum, name, surname);
		
		default:	System.out.println("Invalid statement");
		}
	}

}
