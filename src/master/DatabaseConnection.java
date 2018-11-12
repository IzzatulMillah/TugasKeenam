package master;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static String DB_URL = "jdbc:mysql://192.168.23.220:3306/database_master" + 
	"?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Asia/Jakarta";
	static String USER = "sofco";
	static String PASS = "s3234";

	private static Connection connection;

	private DatabaseConnection() {

	}

	public static Connection getConnection() {
		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Class DatabaseConnection.java : Koneksi berhasil.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Koneksi ke database gagal.");
		}
		return connection;
	}
	
	public static void main(String[] args) {
		DatabaseConnection d = new DatabaseConnection();
		System.out.println(d);
	}
}
