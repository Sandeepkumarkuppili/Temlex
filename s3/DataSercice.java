
import java.util.Collection;
import java.sql.*;
import java.util.Date;

public class DataSercice {
	
	DataService ds=new DataService();
	ds.CreateConnection();
	
	
	
	void CreateConection() {
		int count=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM TESTING");
		while(rs.next()) {
			count++;
		}
		System.out.println(count);
		}
		
		stmt.close();
	}
	catch (Exception e) {
		System.out.println("there is an excetion with database");
	}
	
	void saveTerm(String s) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("INSERT INTO TESTING (TERM) VALUES("+s+");");
		}
		catch (Exception e) {
			System.out.println("Exception caught");
		}
	}
	

}
