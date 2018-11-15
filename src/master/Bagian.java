package master;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Bagian {
	
	private String kodeBagian;
	private String namaBagian;
	
	public Bagian() {}
	
	public Bagian(String kodeBagian, String namaBagian) {
		this.setKodeBagian(kodeBagian);
		this.setNamaBagian(namaBagian);
	}

	public String getKodeBagian() {
		return kodeBagian;
	}

	public void setKodeBagian(String kodeBagian) {
		this.kodeBagian = kodeBagian;
	}

	public String getNamaBagian() {
		return namaBagian;
	}

	public void setNamaBagian(String namaBagian) {
		this.namaBagian = namaBagian;
	}
	
	public void insertBagian() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		
		PreparedStatement pStatement;

		String sql = "INSERT INTO master_bagian(" +
				"kode_bagian, nama_bagian)"       + 
				" VALUES ('"                      + 
				this.kodeBagian + "','" + this.namaBagian + "')";

		try {
			pStatement = connection.prepareStatement(sql);
			pStatement.execute();

			System.out.println("Input data master bagian berhasil.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void updateBagian() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		
		PreparedStatement pStatement;

		String sql = "UPDATE master_bagian SET " +
				"nama_bagian = '" + this.namaBagian + "'"+
				" WHERE kode_bagian = '" + this.kodeBagian + "'";

		try {
			pStatement = connection.prepareStatement(sql);
			pStatement.execute();

			System.out.println("Update data master bagian berhasil");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void deleteBagian() throws CustomException, SQLException{
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		
		PreparedStatement pStatement;

		String sql = "DELETE FROM master_bagian WHERE kode_bagian = '" + this.kodeBagian + "'";
		try {
			pStatement = connection.prepareStatement(sql);
			pStatement.execute();

			System.out.println("Hapus data master bagian berhasil");
		} catch (SQLException e) {
			throw new CustomException(e.toString());
		}
	}
}
