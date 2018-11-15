package master;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DetailTransaksi {
	private int nomorBon;
	private String kodeBarang;
	private double jumlahDipesan;
	private String unit;
	private double jumlahTotal;
	private String unitStok;

	public DetailTransaksi() {

	}

	public DetailTransaksi(int nomorBon, String kodeBarang, double jumlahDipesan, 
			String unit, double jumlahTotal, String unitStok) {
		this.nomorBon = nomorBon;
		this.kodeBarang = kodeBarang;
		this.jumlahDipesan = jumlahDipesan;
		this.unit = unit;
		this.jumlahTotal = jumlahTotal;
		this.unitStok = unitStok;
	}

	public int getNomorBon() {
		return nomorBon;
	}

	public void setNomorBon(int nomorBon) {
		this.nomorBon = nomorBon;
	}

	public String getKodeBarang() {
		return kodeBarang;
	}

	public void setKodeBarang(String kodeBarang) {
		this.kodeBarang = kodeBarang;
	}

	public double getJumlahDipesan() {
		return jumlahDipesan;
	}

	public void setJumlahDipesan(double jumlahDipesan) {
		this.jumlahDipesan = jumlahDipesan;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getJumlahTotal() {
		return jumlahTotal;
	}

	public void setJumlahTotal(double jumlahTotal) {
		this.jumlahTotal = jumlahTotal;
	}

	public String getUnitStok() {
		return unitStok;
	}

	public void setUnitStok(String unitStok) {
		this.unitStok = unitStok;
	}

	public void insertDetail() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();

		PreparedStatement pStatement;

		String sql = "INSERT INTO detail_permintaan_pembelian(" + 
				"nomor_bon, kode_barang, " +
				"jumlah_dipesan, unit, "   +
				"jumlah_total, unit_stok)" + 
				" VALUES ('"               + 
				this.nomorBon      + "','" + this.kodeBarang + "','" +
				this.jumlahDipesan + "','" + this.unit       + "','" +
				this.jumlahTotal   + "','" + this.unitStok   + "')";

		pStatement = connection.prepareStatement(sql);
		pStatement.execute();

		System.out.println("Input permintaan pembelian barang berhasil.");
	}

	public void updateDetail() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();

		PreparedStatement pStatement;

		String sql = "UPDATE detail_permintaan_pembelian SET " +
				"nomor_bon = '"        + this.nomorBon      + "'," +
				" kode_barang = '"     + this.kodeBarang    + "'," +
				" jumlah_dipesan = '"  + this.jumlahDipesan + "'," +
				" unit = '"            + this.unit          + "'," +
				" jumlah_total = '"    + this.jumlahTotal   + "'," +
				" unit_stok = '"       + this.unitStok      + "'" +
				" WHERE nomor_bon = '" + this.nomorBon + "'";

		pStatement = connection.prepareStatement(sql);
		pStatement.execute();

		System.out.println("Update permintaan pembelian barang berhasil");
	}

	public void deleteDetail() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();

		PreparedStatement pStatement;

		String sql = "DELETE FROM detail_permintaan_pembelian WHERE nomor_bon = '" + this.nomorBon + "'";

		pStatement = connection.prepareStatement(sql);
		pStatement.execute();

		System.out.println("Hapus permintaan pembelian barang berhasil");
	}
}
