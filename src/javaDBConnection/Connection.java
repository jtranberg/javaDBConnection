package javaDBConnection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {

	public static void main(String[] args) throws SQLException{

	
		java.sql.Connection connection = null;
			try {
				Class.forName("org.postgresql.Driver");
				connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Employees","postgres","123456");
		
				if(connection != null) {
					System.out.println("connection OK!");
				}else {
					System.out.println("connection Failed!");
				}

	}catch  (Exception e)   {
		System.out.println(e);
	}
	}
		

}
