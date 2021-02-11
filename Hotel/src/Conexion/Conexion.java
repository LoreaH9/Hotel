package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	private static final String HOST = "localhost:3306";
	private static final String BBDD = "hotel";
	private static final String USERNAME = "lorea";
	private static final String PASSWORD = "Admin1234";
	
	protected static Connection conexion;

	public Conexion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BBDD, USERNAME, PASSWORD);
	
		}catch(SQLException sqle) {
			//sqle.printStackTrace();
			System.out.println(sqle.getMessage());
		}catch(ClassNotFoundException cnfe) {
			//cnfe.printStackTrace();
			System.out.println(cnfe.getMessage());
		}
	}
}
