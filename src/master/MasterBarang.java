package master;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MasterBarang {
	private String namaBarang;
	private String unitSatu;
	private String unitDua;
	private String unitStok;
	private String statusBarang;

	private int kodeBarang;
	private int hasilKonversiUnitSatu;
	private int hasilKonversiUnitDua;

	Connection connection = DatabaseConnection.getConnection();

	public MasterBarang() {

	}
	
	public MasterBarang(int kodeBarang, String namaBarang, 
						String unitSatu, int hasilKonversiUnitSatu, 
						String unitDua, int hasilKonversiUnitDua, 
						String unitStok, String statusBarang) {
		this.kodeBarang = kodeBarang;
		this.namaBarang = namaBarang;
		this.unitSatu = unitSatu;
		this.hasilKonversiUnitSatu = hasilKonversiUnitSatu;
		this.unitDua = unitDua;
		this.hasilKonversiUnitDua = hasilKonversiUnitDua;
		this.unitStok = unitStok;
		this.statusBarang = statusBarang;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public String getUnitSatu() {
		return unitSatu;
	}

	public void setUnitSatu(String unitSatu) {
		this.unitSatu = unitSatu;
	}

	public String getUnitDua() {
		return unitDua;
	}

	public void setUnitDua(String unitDua) {
		this.unitDua = unitDua;
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

	public int getKodeBarang() {
		return kodeBarang;
	}

	public int getHasilKonversiUnitSatu() {
		return hasilKonversiUnitSatu;
	}

	public void setHasilKonversiUnitSatu(int hasilKonversiUnitSatu) {
		this.hasilKonversiUnitSatu = hasilKonversiUnitSatu;
	}

	public int getHasilKonversiUnitDua() {
		return hasilKonversiUnitDua;
	}

	public void setHasilKonversiUnitDua(int hasilKonversiUnitDua) {
		this.hasilKonversiUnitDua = hasilKonversiUnitDua;
	}

	public void insertBarang() {
		PreparedStatement pStatement;

		String sql = "INSERT INTO master_barang("      + 
				"nama_barang, unit_satu, "             +
				"hasil_konversi_unit_satu, unit_dua, " +
				"hasil_konversi_unit_dua, unit_stok, " +
				"status_barang)" + 
				" VALUES ('"     + 
				this.namaBarang + "','"    + this.unitSatu + "','"         + 
				this.hasilKonversiUnitSatu + "','" + this.unitDua + "','"  + 
				this.hasilKonversiUnitDua  + "','" + this.unitStok + "','" +
				this.statusBarang + "')";

		try {
			pStatement = connection.prepareStatement(sql);
			pStatement.execute();

			System.out.println("Input data master barang berhasil.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void updateBarang() {
		PreparedStatement pStatement;

		String sql = "UPDATE master_barang SET " +
				"nama_barang = '" + this.namaBarang + "', unit_satu = '" + this.unitSatu +
				"', hasil_konversi_unit_satu = '" + this.hasilKonversiUnitSatu + "', unit_dua = '" + this.unitDua +
				"', hasil_konversi_unit_dua = '" + this.hasilKonversiUnitDua + "', unit_stok = '" + this.unitStok +
				"status_barang = '" + this.statusBarang +
				"' WHERE id = " + this.kodeBarang;

		try {
			pStatement = connection.prepareStatement(sql);
			pStatement.execute();

			System.out.println("Update data master barang berhasil");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void deleteBarang() {
		PreparedStatement pStatement;
		String sql = "DELETE FROM master_barang WHERE id = '" + this.kodeBarang + "'";

		try {
			pStatement = connection.prepareStatement(sql);
			pStatement.execute();

			System.out.println("Hapus data master barang berhasil");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
