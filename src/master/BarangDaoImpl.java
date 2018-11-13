package master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BarangDaoImpl implements BarangDao{
	
	Connection connection = DatabaseConnection.getConnection();
	
	public BarangDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getAllBarang() {
		
		Statement statement;
		ResultSet resultSet;
		
		String namaBarang;
		String unitSatu;
		String unitDua;
		String unitStok;
		String statusBarang;
		int kodeBarang;
		int hasilKonversiUnitSatu;
		int hasilKonversiUnitDua;
		
		String sql = "SELECT * FROM master_barang";
		
		System.out.println("\n****** Data Master Barang ******\n");
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while(resultSet.next()){
				kodeBarang = resultSet.getInt("kode_barang");
				namaBarang = resultSet.getString("nama_barang");
				unitSatu = resultSet.getString("unit_satu");
				hasilKonversiUnitSatu = resultSet.getInt("hasil_konversi_unit_satu");
				unitDua = resultSet.getString("unit_dua");
				hasilKonversiUnitDua = resultSet.getInt("hasil_konversi_unit_dua");
				unitStok = resultSet.getString("unit_stok");
				statusBarang = resultSet.getString("status_barang");
				
				System.out.println("Kode Barang      : " + kodeBarang);
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

	@Override
	public void getAllBarangAktif() {
		Statement statement;
		ResultSet resultSet;
		
		String namaBarang;
		String unitSatu;
		String unitDua;
		String unitStok;
		String statusBarang;
		int kodeBarang;
		int hasilKonversiUnitSatu;
		int hasilKonversiUnitDua;
		
		String sql = "SELECT * FROM master_barang WHERE status_barang = 'aktif'";
		
		System.out.println("\n****** Data Master Barang Aktif ******\n");

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				kodeBarang = resultSet.getInt("kode_barang");
				namaBarang = resultSet.getString("nama_barang");
				unitSatu = resultSet.getString("unit_satu");
				hasilKonversiUnitSatu = resultSet.getInt("hasil_konversi_unit_satu");
				unitDua = resultSet.getString("unit_dua");
				hasilKonversiUnitDua = resultSet.getInt("hasil_konversi_unit_dua");
				unitStok = resultSet.getString("unit_stok");
				statusBarang = resultSet.getString("status_barang");
				
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

	@Override
	public void searchBarang(int kodeBarang) {
		Statement statement;
		ResultSet resultSet;
		
		String namaBarang;
		String unitSatu;
		String unitDua;
		String unitStok;
		String statusBarang;
		int hasilKonversiUnitSatu;
		int hasilKonversiUnitDua;
		
		String sql = "SELECT * FROM master_barang WHERE kode_barang = " + kodeBarang;
		
		System.out.println("\n****** Data Master Barang Berdasarkan Kode tertentu ******\n");
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				kodeBarang = resultSet.getInt("kode_barang");
				namaBarang = resultSet.getString("nama_barang");
				unitSatu = resultSet.getString("unit_satu");
				hasilKonversiUnitSatu = resultSet.getInt("hasil_konversi_unit_satu");
				unitDua = resultSet.getString("unit_dua");
				hasilKonversiUnitDua = resultSet.getInt("hasil_konversi_unit_dua");
				unitStok = resultSet.getString("unit_stok");
				statusBarang = resultSet.getString("status_barang");
				
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

	@Override
	public void searchBarang(String namaBarang) {
		Statement statement;
		ResultSet resultSet;
		
		String unitSatu;
		String unitDua;
		String unitStok;
		String statusBarang;
		int kodeBarang;
		int hasilKonversiUnitSatu;
		int hasilKonversiUnitDua;
		
		String sql = "SELECT * FROM master_barang WHERE nama_barang LIKE '%" + namaBarang + "%'";
		
		System.out.println("\n****** Data Master Barang Berdasarkan Nama tertentu ******\n");
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			
			while(resultSet.next()){
				kodeBarang = resultSet.getInt("kode_barang");
				namaBarang = resultSet.getString("nama_barang");
				unitSatu = resultSet.getString("unit_satu");
				hasilKonversiUnitSatu = resultSet.getInt("hasil_konversi_unit_satu");
				unitDua = resultSet.getString("unit_dua");
				hasilKonversiUnitDua = resultSet.getInt("hasil_konversi_unit_dua");
				unitStok = resultSet.getString("unit_stok");
				statusBarang = resultSet.getString("status_barang");
				
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

	@Override
	public String getStatusBarang(int kodeBarang) {
		Statement statement;
		ResultSet resultSet;
		
		String statusBarang;
		
		String sql = "SELECT * FROM master_barang WHERE kode_barang = " + kodeBarang;
		
		System.out.println("****** Data Master Barang ******\n");
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while(resultSet.next()){
				statusBarang = resultSet.getString("status_barang");
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
