//DB Connection in Java(https://stackoverflow.com/questions/2839321/connect-java-to-a-mysql-database)

import java.sql.*;

public class DatabaseConnect1 {

	String url = "jdbc:mysql://localhost:3306/javabase";
	String username = "java";
	String password = "password";

	System.out.println("Connecting database...");

	try (Connection connection = DriverManager.getConnection(url, username, password)) {
		System.out.println("Database connected!");
	} catch (SQLException e) {
		throw new IllegalStateException("Cannot connect the database!", e);
	}
}
}

//"Try" and "catch" are keywords that represent the handling of exceptions due to data or coding errors during program execution. A try block is the block of code in which exceptions occur. A 'catch' block catches and handles try block exceptions.