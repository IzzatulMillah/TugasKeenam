package master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransaksiDAO {

	public TransaksiDAO() {

	}
	
	public ResultSet getAllTransaksi() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();

		Statement statement;
		ResultSet resultSet;

		String sql = "SELECT permintaan_pembelian.nomor_bon, permintaan_pembelian.tanggal_bon, " +
					 "permintaan_pembelian.kode_bagian_peminta, permintaan_pembelian.keterangan, " +
					 "detail_permintaan_pembelian.kode_barang, detail_permintaan_pembelian.jumlah_dipesan, " +
					 "detail_permintaan_pembelian.unit " +
					 "FROM permintaan_pembelian, detail_permintaan_pembelian " +
					 "WHERE permintaan_pembelian.nomor_bon = detail_permintaan_pembelian.nomor_bon";

		System.out.println("\n****** Data Permintaan Pembelian ******\n");

		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);

		return resultSet;
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

		System.out.println("\n****** Data Header Detail Permintaan Pembelian ******\n");

		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);

		while(resultSet.next()){
			String nomorBon = resultSet.getString("nomor_bon");
			String kodeBarang = resultSet.getString("kode_barang");
			String jumlahDipesan = resultSet.getString("jumlah_dipesan");
			String unit = resultSet.getString("unit");

			System.out.println("Nomor Bon      : " + nomorBon);
			System.out.println("Tanggal Bon    : " + kodeBarang);
			System.out.println("Bagian Peminta : " + jumlahDipesan);
			System.out.println("Tanggal Bon    : " + unit);
			System.out.println("--------------------------------------------");
		}
	}
}
