package geeky.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.PreparedStatement;
public class JDBC_Connect{
	public static void testjdbc () throws SQLException {
		String url = "jdbc:postgresql://localhost/GeekyCamp";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "bobivk2000");
		Connection conn = DriverManager.getConnection(url, props);
		PreparedStatement prepareStatement = null;
		try{
			conn.prepareStatement("Create TABLE students(Fac_number INTEGER PRIMARY KEY, Name VARCHAR (50) NOT NULL, Surname VARCHAR(50) NOT NULL);").executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			conn.close();
		}

	} 
	public static void addNew(int facnum, String name, String surname) throws SQLException{
		String url = "jdbc:postgresql://localhost/GeekyCamp";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "bobivk2000");
		Connection conn = DriverManager.getConnection(url, props);
		PreparedStatement prepareStatement = null;
		try{
			conn.prepareStatement("INSERT INTO students (Fac_number, Name, Surname) VALUES(" + facnum + ", " + name + ", " + surname + ")").executeUpdate();
			facnum++;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			conn.close();
		}
	}
	public static void select(String SQL_SelectCommand) throws SQLException{
		String url = "jdbc:postgresql://localhost/GeekyCamp";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "bobivk2000");
		Connection conn = DriverManager.getConnection(url, props);
		PreparedStatement prepareStatement = null;
		try{
			conn.prepareStatement("SQL_SelectCommand").executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			conn.close();
		}
	}
	public static void delete(int ID) throws SQLException{
		String url = "jdbc:postgresql://localhost/GeekyCamp";
		Properties props = new Properties();
		props.setProperty("user", "postgres");
		props.setProperty("password", "bobivk2000");
		Connection conn = DriverManager.getConnection(url, props);
		PreparedStatement prepareStatement = null;
		try{
			conn.prepareStatement("DELETE FROM students WHERE Fac_id =" + ID + ";").executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			conn.close();
		}
	}
}
