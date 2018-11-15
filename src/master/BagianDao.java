package master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BagianDao {

	public BagianDao() {

	}
	
	public void getAllBagian() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();

		Statement statement;
		ResultSet resultSet;

		String kodeBagian;
		String namaBagian;

		String sql = "SELECT * FROM master_bagian";

		System.out.println("\n****** Data Master Bagian ******\n");
		
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);

		while(resultSet.next()){
			kodeBagian = resultSet.getString("kode_bagian");
			namaBagian = resultSet.getString("nama_bagian");

			System.out.println("Kode Bagian      : " + kodeBagian);
			System.out.println("Nama Bagian      : " + namaBagian);
			System.out.println("--------------------------------------------");
		}
		
		statement.close();
		resultSet.close();
	}
}
