package master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BarangDao{
	
	public BarangDao() {
		// TODO Auto-generated constructor stub
	}

	public void getAllBarang() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		
		Statement statement;
		ResultSet resultSet;
		
		String namaBarang;
		String unitSatu;
		String unitDua;
		String unitStok;
		String statusBarang;
		String kodeBarang;
		double hasilKonversiUnitSatu;
		double hasilKonversiUnitDua;
		
		String sql = "SELECT * FROM master_barang";
		
		System.out.println("\n****** Data Master Barang ******\n");
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while(resultSet.next()){
				kodeBarang = resultSet.getString("kode_barang");
				namaBarang = resultSet.getString("nama_barang");
				unitSatu = resultSet.getString("unit1");
				hasilKonversiUnitSatu = resultSet.getDouble("konversi_unit1");
				unitDua = resultSet.getString("unit2");
				hasilKonversiUnitDua = resultSet.getDouble("konversi_unit2");
				unitStok = resultSet.getString("unit_stok");
				statusBarang = resultSet.getString("aktif");
				
				System.out.println("Kode Barang      : " + kodeBarang);
				System.out.println("Nama Barang      : " + namaBarang);
				System.out.println("Unit Satu        : " + unitSatu);
				System.out.println("Hasil konversi 1 : " + hasilKonversiUnitSatu);
				System.out.println("Unit Dua         : " + unitDua);
				System.out.println("Hasil konversi 2 : " + hasilKonversiUnitDua);
				System.out.println("Unit Stok        : " + unitStok);
				System.out.println("Aktif            : " + statusBarang);
				System.out.println("--------------------------------------------");
			}
			statement.close();
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void getAllBarangAktif() throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		
		Statement statement;
		ResultSet resultSet;
		
		String namaBarang;
		String unitSatu;
		String unitDua;
		String unitStok;
		String statusBarang;
		String kodeBarang;
		double hasilKonversiUnitSatu;
		double hasilKonversiUnitDua;
		
		String sql = "SELECT * FROM master_barang WHERE status_barang = 'y'";
		
		System.out.println("\n****** Data Master Barang Aktif ******\n");

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				kodeBarang = resultSet.getString("kode_barang");
				namaBarang = resultSet.getString("nama_barang");
				unitSatu = resultSet.getString("unit1");
				hasilKonversiUnitSatu = resultSet.getDouble("konversi_unit1");
				unitDua = resultSet.getString("unit2");
				hasilKonversiUnitDua = resultSet.getDouble("konversi_unit2");
				unitStok = resultSet.getString("unit_stok");
				statusBarang = resultSet.getString("aktif");
				
				System.out.println("Kode Barang 	 : " + kodeBarang);
				System.out.println("Nama Barang      : " + namaBarang);
				System.out.println("Unit Satu        : " + unitSatu);
				System.out.println("Hasil konversi 1 : " + hasilKonversiUnitSatu);
				System.out.println("Unit Dua         : " + unitDua);
				System.out.println("Hasil konversi 2 : " + hasilKonversiUnitDua);
				System.out.println("Unit Stok        : " + unitStok);
				System.out.println("Status Barang    : " + statusBarang);
				System.out.println("--------------------------------------------");
			}
			statement.close();
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void searchBarangByCode(String kodeBarang) throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		
		Statement statement;
		ResultSet resultSet;
		
		String namaBarang;
		String unitSatu;
		String unitDua;
		String unitStok;
		String statusBarang;
		double hasilKonversiUnitSatu;
		double hasilKonversiUnitDua;
		
		String sql = "SELECT * FROM master_barang WHERE kode_barang = " + kodeBarang;
		
		System.out.println("\n****** Data Master Barang Berdasarkan Kode tertentu ******\n");
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				kodeBarang = resultSet.getString("kode_barang");
				namaBarang = resultSet.getString("nama_barang");
				unitSatu = resultSet.getString("unit1");
				hasilKonversiUnitSatu = resultSet.getDouble("konversi_unit1");
				unitDua = resultSet.getString("unit2");
				hasilKonversiUnitDua = resultSet.getDouble("konversi_unit2");
				unitStok = resultSet.getString("unit_stok");
				statusBarang = resultSet.getString("aktif");
				
				System.out.println("Kode Barang 	 : " + kodeBarang);
				System.out.println("Nama Barang      : " + namaBarang);
				System.out.println("Unit Satu        : " + unitSatu);
				System.out.println("Hasil konversi 1 : " + hasilKonversiUnitSatu);
				System.out.println("Unit Dua         : " + unitDua);
				System.out.println("Hasil konversi 2 : " + hasilKonversiUnitDua);
				System.out.println("Unit Stok        : " + unitStok);
				System.out.println("Status Barang    : " + statusBarang);
				System.out.println("--------------------------------------------");
			}
			statement.close();
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void searchBarangByName(String namaBarang) throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		
		Statement statement;
		ResultSet resultSet;
		
		String unitSatu;
		String unitDua;
		String unitStok;
		String statusBarang;
		String kodeBarang;
		double hasilKonversiUnitSatu;
		double hasilKonversiUnitDua;
		
		String sql = "SELECT * FROM master_barang WHERE nama_barang LIKE '%" + namaBarang + "%'";
		
		System.out.println("\n****** Data Master Barang Berdasarkan Nama tertentu ******\n");
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				kodeBarang = resultSet.getString("kode_barang");
				namaBarang = resultSet.getString("nama_barang");
				unitSatu = resultSet.getString("unit1");
				hasilKonversiUnitSatu = resultSet.getDouble("konversi_unit1");
				unitDua = resultSet.getString("unit2");
				hasilKonversiUnitDua = resultSet.getDouble("konversi_unit2");
				unitStok = resultSet.getString("unit_stok");
				statusBarang = resultSet.getString("aktif");
				
				System.out.println("Kode Barang 	 : " + kodeBarang);
				System.out.println("Nama Barang      : " + namaBarang);
				System.out.println("Unit Satu        : " + unitSatu);
				System.out.println("Hasil konversi 1 : " + hasilKonversiUnitSatu);
				System.out.println("Unit Dua         : " + unitDua);
				System.out.println("Hasil konversi 2 : " + hasilKonversiUnitDua);
				System.out.println("Unit Stok        : " + unitStok);
				System.out.println("Status Barang    : " + statusBarang);
				System.out.println("--------------------------------------------");
			}
			statement.close();
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public String getStatusBarang(String kodeBarang) throws SQLException {
		DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
		Connection connection = databaseConnection.getConnection();
		
		Statement statement;
		ResultSet resultSet;
		
		String statusBarang;
		
		String sql = "SELECT * FROM master_barang WHERE kode_barang = " + kodeBarang;
		
		System.out.println("****** Data Master Barang ******\n");
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while(resultSet.next()){
				statusBarang = resultSet.getString("aktif");
				return statusBarang;
			}
			statement.close();
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return null;
	}
}
