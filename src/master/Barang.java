package master;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Barang {
	private String kodeBarang;
	private String namaBarang;
	private String unit1;
	private String unit2;
	private String unitStok;
	private String statusBarang;

	private double hasilKonversiUnit1;
	private double hasilKonversiUnit2;

	public Barang() {

	}

	public Barang(String kodeBarang, String namaBarang, 
			String unit1, double hasilKonversiunit1, 
			String unit2, double hasilKonversiunit2, 
			String unitStok, String statusBarang) {
		this.kodeBarang = kodeBarang;
		this.namaBarang = namaBarang;
		this.unit1 = unit1;
		this.hasilKonversiUnit1 = hasilKonversiunit1;
		this.unit2 = unit2;
		this.hasilKonversiUnit2 = hasilKonversiunit2;
		this.unitStok = unitStok;
		this.statusBarang = statusBarang;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public String getunit1() {
		return unit1;
	}

	public void setunit1(String unit1) {
		this.unit1 = unit1;
	}

	public String getunit2() {
		return unit2;
	}

	public void setunit2(String unit2) {
		this.unit2 = unit2;
	}

	public String getUnitStok() {
		return unitStok;
	}

	public void setUnitStok(String unitStok) {
		this.unitStok = unitStok;
	}

	public String getStatusBarang() {
		return statusBarang;
	}

	public void setStatusBarang(String statusBarang) {
		this.statusBarang = statusBarang;
	}

	public String getKodeBarang() {
		return kodeBarang;
	}

	public double getHasilKonversiUnit1() {
		return hasilKonversiUnit1;
	}

	public void setHasilKonversiunit1(double hasilKonversiUnit1) {
		this.hasilKonversiUnit1 = hasilKonversiUnit1;
	}

	public double getHasilKonversiUnit2() {
		return hasilKonversiUnit2;
	}

	public void setHasilKonversiUnit2(double hasilKonversiUnit2) {
		this.hasilKonversiUnit2 = hasilKonversiUnit2;
	}

	public void insertBarang() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		
		PreparedStatement pStatement;

		String sql = "INSERT INTO master_barang(" + 
				"kode_barang, nama_barang, "      +
				"unit1, konversi_unit1, "         +
				"unit2, konversi_unit2, "         +
				"unit_stok, aktif)"               + 
				" VALUES ('"                      + 
				this.kodeBarang + "','" + this.namaBarang     + "','" +
				this.unit1 + "','" + this.hasilKonversiUnit1  + "','" + 
				this.unit2 + "','"  + this.hasilKonversiUnit2 + "','" + 
				this.unitStok + "','" + this.statusBarang     + "')";

		try {
			pStatement = connection.prepareStatement(sql);
			pStatement.execute();

			System.out.println("Input data master barang berhasil.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void updateBarang() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		
		PreparedStatement pStatement;

		String sql = "UPDATE master_barang SET " +
				"nama_barang = '"     + this.namaBarang         + "'," +
				" unit1 = '"          + this.unit1              + "'," +
				" konversi_unit1 = '" + this.hasilKonversiUnit1 + "'," +
				" unit2 = '"          + this.unit2              + "'," +
				" konversi_unit2 = '" + this.hasilKonversiUnit2 + "'," +
				" unit_stok = '"      + this.unitStok           + "'," +
				" aktif = '"          + this.statusBarang       + "'"  +
				" WHERE kode_barang = '" + this.kodeBarang + "'";

		try {
			pStatement = connection.prepareStatement(sql);
			pStatement.execute();

			System.out.println("Update data master barang berhasil");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void deleteBarang() throws CustomException, SQLException{
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		
		PreparedStatement pStatement;

		String sql = "DELETE FROM master_barang WHERE kode_barang = '" + this.kodeBarang + "'";
		try {
			pStatement = connection.prepareStatement(sql);
			pStatement.execute();

			System.out.println("Hapus data master barang berhasil");
		} catch (SQLException e) {
			throw new CustomException(e.toString());
		}
	}
}
