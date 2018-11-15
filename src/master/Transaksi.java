package master;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaksi {
	private int nomorBon;
	private String tanggalBon;
	private String kodeBagianPeminta;
	private String keteranganBon;

	public Transaksi() {

	}
	
	public Transaksi(int nomorBon, String tanggalBon, String kodeBagianPeminta, String keteranganBon) {
		this.nomorBon = nomorBon;
		this.tanggalBon = tanggalBon;
		this.kodeBagianPeminta = kodeBagianPeminta;
		this.keteranganBon = keteranganBon;
	}

	public int getNomorBon() {
		return nomorBon;
	}

	public void setNomorBon(int nomorBon) {
		this.nomorBon = nomorBon;
	}

	public String getTanggalBon() {
		return tanggalBon;
	}

	public void setTanggalBon(String tanggalBon) {
		this.tanggalBon = tanggalBon;
	}

	public String getKodeBagianPeminta() {
		return kodeBagianPeminta;
	}

	public void setKodeBagianPeminta(String kodeBagianPeminta) {
		this.kodeBagianPeminta = kodeBagianPeminta;
	}

	public String getKeteranganBon() {
		return keteranganBon;
	}

	public void setKeteranganBon(String keteranganBon) {
		this.keteranganBon = keteranganBon;
	}

	public void insertPermintaanPembelian() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();

		PreparedStatement pStatement;

		String sql = "INSERT INTO permintaan_pembelian(" + 
				"nomor_bon, tanggal_bon, "               +
				"kode_bagian_peminta, keterangan)"       + 
				" VALUES ('"                             + 
				this.nomorBon + "','" + this.tanggalBon     + "','" +
				this.kodeBagianPeminta + "','" + this.keteranganBon     + "')";

		pStatement = connection.prepareStatement(sql);
		pStatement.execute();

		System.out.println("Input permintaan pembelian barang berhasil.");
	}

	public void updatePermintaanPembelian() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();

		PreparedStatement pStatement;

		String sql = "UPDATE permintaan_pembelian SET " +
				"tanggal_bon = '"          + this.tanggalBon        + "'," +
				" kode_bagian_peminta = '" + this.kodeBagianPeminta + "'," +
				" keterangan = '"          + this.keteranganBon     + "'" +
				" WHERE nomor_bon = '" + this.nomorBon + "'";

		pStatement = connection.prepareStatement(sql);
		pStatement.execute();

		System.out.println("Update permintaan pembelian barang berhasil");
	}

	public void deletePermintaanPembelian() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();

		PreparedStatement pStatement;

		String sql = "DELETE FROM permintaan_pembelian WHERE nomor_bon = '" + this.nomorBon + "'";

		pStatement = connection.prepareStatement(sql);
		pStatement.execute();

		System.out.println("Hapus permintaan pembelian barang berhasil");
	}
}
