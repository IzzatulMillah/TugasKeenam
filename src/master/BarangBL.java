package master;

import java.sql.SQLException;

public class BarangBL {

	BarangDao barangDao = new BarangDao();

	public BarangBL() {

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
		validasiBarangAktif(barang.getKodeBarang());
		barang.deleteBarang();
	}

	public void validasiBarangAktif(String kodeBarang) throws SQLException, CustomException {
		String aktif;

		aktif = barangDao.getStatusBarang(kodeBarang);
		if(aktif.equalsIgnoreCase("y")) {
			throw new CustomException("Barang aktif tidak dapat dihapus");
		}
	}
}
