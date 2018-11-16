package master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BagianDao {

	public BagianDao() {

	}
	
	public List<Bagian> getAllBagian() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		List<Bagian> listBagian = new ArrayList<>();

		Statement statement;
		ResultSet resultSet;

		String sql = "SELECT * FROM master_bagian";

		System.out.println("\n****** Data Master Bagian ******\n");
		
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);

		while(resultSet.next()){
			String kodeBagian = resultSet.getString("kode_bagian");
			String namaBagian = resultSet.getString("nama_bagian");

			listBagian.add(new Bagian(kodeBagian, namaBagian));
		}
		
		statement.close();
		resultSet.close();
		
		return listBagian;
	}
	
	public boolean isKodeBagianExist() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		Statement statement;
		ResultSet resultSet;

		String sql = "SELECT permintaan_pembelian.kode_bagian_peminta " +
					 "FROM permintaan_pembelian " +
					 "WHERE permintaan_pembelian.kode_bagian_peminta " +
					 		"AND EXISTS (SELECT master_bagian.kode_bagian " +
					 		"FROM master_bagian " +
					 		"WHERE permintaan_pembelian.kode_bagian_peminta = master_bagian.kode_bagian)";
		
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
		
		while(resultSet.next()){
			return true;
		}
		return false;
	}
}
