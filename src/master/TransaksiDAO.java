package master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransaksiDAO {

	public TransaksiDAO() {

	}

	public void getAllHeader() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();

		Statement statement;
		ResultSet resultSet;

		String sql = "SELECT * FROM permintaan_pembelian";

		System.out.println("\n****** Data Header Permintaan Pembelian ******\n");

		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);

		while(resultSet.next()){
			String nomorBon = resultSet.getString("nomor_bon");
			String tanggalBon = resultSet.getString("tanggal_bon");
			String kodeBagianPeminta = resultSet.getString("kode_bagian_peminta");
			String keteranganBon = resultSet.getString("keterangan");

			System.out.println("Nomor Bon      : " + nomorBon);
			System.out.println("Tanggal Bon    : " + tanggalBon);
			System.out.println("Bagian Peminta : " + kodeBagianPeminta);
			System.out.println("Keterangan     : " + keteranganBon);
			System.out.println("--------------------------------------------");
		}
	}

	public void getAllHeaderDetail() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();

		Statement statement;
		ResultSet resultSet;

		String sql = "SELECT * FROM detail_permintaan_pembelian";

		System.out.println("\n****** Data Header Permintaan Pembelian ******\n");

		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);

		while(resultSet.next()){
			String nomorBon = resultSet.getString("nomor_bon");
			String tanggalBon = resultSet.getString("tanggal_bon");
			String kodeBagianPeminta = resultSet.getString("kode_bagian_peminta");
			String keteranganBon = resultSet.getString("keterangan");

			System.out.println("Nomor Bon      : " + nomorBon);
			System.out.println("Tanggal Bon    : " + tanggalBon);
			System.out.println("Bagian Peminta : " + kodeBagianPeminta);
			System.out.println("Tanggal Bon    : " + keteranganBon);
			System.out.println("--------------------------------------------");
		}
	}
}
