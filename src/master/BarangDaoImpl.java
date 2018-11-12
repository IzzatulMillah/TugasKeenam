package master;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BarangDaoImpl implements BarangDao{
	
	Connection connection = DatabaseConnection.getConnection();
	
	public BarangDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<MasterBarang> getAllBarang() {
		List<MasterBarang> listMasterbarang = new ArrayList<>();
		
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
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while(resultSet.next()){
				kodeBarang = resultSet.getInt("kode_barang");
				namaBarang = resultSet.getString("nama");
				unitSatu = resultSet.getString("unit_satu");
				hasilKonversiUnitSatu = resultSet.getInt("hasil_konversi_unit_satu");
				unitDua = resultSet.getString("unit_dua");
				hasilKonversiUnitDua = resultSet.getInt("hasil_konversi_unit_dua");
				unitStok = resultSet.getString("unit_stok");
				statusBarang = resultSet.getString("status_barang");
				listMasterbarang.add(new MasterBarang(kodeBarang, namaBarang, 
													  unitSatu, hasilKonversiUnitSatu, 
													  unitDua, hasilKonversiUnitDua, 
													  unitStok, statusBarang));
			}

			statement.close();
			resultSet.close();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return listMasterbarang;
	}

	@Override
	public List<MasterBarang> getAllBarangAktif() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MasterBarang getBarang(int kodeBarang) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MasterBarang getBarang(String namaBarang) {
		// TODO Auto-generated method stub
		return null;
	}
}
