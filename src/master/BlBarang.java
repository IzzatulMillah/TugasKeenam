package master;

import java.sql.SQLException;

public class BlBarang {
	
	BarangDao barangDao = new BarangDao();
	
	public BlBarang() {
		
	}
	
	public void insertDataBarang(Barang barang) throws SQLException {
		barang.insertBarang();
		System.out.println("insert barang BL berhasil");
	}
	
	public void updateDataBarang(Barang barang) throws SQLException {
		barang.updateBarang();
		System.out.println("update barang BL berhasil");
	}
	
	public void deleteDataBarang(Barang barang) throws CustomException, SQLException {
		boolean status;
		status = validasiBarangAktif(barang.getKodeBarang());
		if(status == true) {
			throw new CustomException("barang Aktif tidak dapat dihapus");
		} else {
			barang.deleteBarang();
			System.out.println("hapus barang BL berhasil");
		}
	}
	
	public boolean validasiBarangAktif(String kodeBarang) throws SQLException {
		String status;
		
		status = barangDao.getStatusBarang(kodeBarang);
		if(status.equalsIgnoreCase("y")) {
			return true;
		} else {
			return false;
		}
	}
}
