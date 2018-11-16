package master;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class TampilanData {

	public TampilanData() {
		
	}
	
	public void showAllBarang() throws SQLException {
		List<Barang> listBarang;
		BarangDao barangDao = new BarangDao();
		listBarang = barangDao.getAllBarang();
		
		for (Barang barang : listBarang) {
			System.out.println("Kode Barang      : " + barang.getKodeBarang());
			System.out.println("Nama Barang      : " + barang.getNamaBarang());
			System.out.println("Unit Satu        : " + barang.getunit1());
			System.out.println("Hasil konversi 1 : " + barang.getHasilKonversiUnit1());
			System.out.println("Unit Dua         : " + barang.getunit2());
			System.out.println("Hasil konversi 2 : " + barang.getHasilKonversiUnit2());
			System.out.println("Unit Stok        : " + barang.getUnitStok());
			System.out.println("Aktif            : " + barang.getStatusBarang());
			System.out.println("--------------------------------------------");
		}
	}
	
	public void showAllBagian() throws SQLException {
		List<Bagian> listBagian;
		BagianDao bagianDao = new BagianDao();
		listBagian = bagianDao.getAllBagian();
		
		for (Bagian bagian : listBagian) {
			System.out.println("Kode Bagian      : " + bagian.getKodeBagian());
			System.out.println("Nama Bagian      : " + bagian.getNamaBagian());
			System.out.println("--------------------------------------------");
		}
	}
	
	public void showAllTransaksi() throws SQLException {
		ResultSet resultSet;
		TransaksiDAO transaksiDAO = new TransaksiDAO();
		resultSet = transaksiDAO.getAllTransaksi();
		
		while(resultSet.next()){
			int nomorBon = resultSet.getInt("permintaan_pembelian.nomor_bon");
			String tanggalBon = resultSet.getString("permintaan_pembelian.tanggal_bon");
			String kodeBagianPeminta = resultSet.getString("permintaan_pembelian.kode_bagian_peminta");
			String keteranganBon = resultSet.getString("permintaan_pembelian.keterangan");
			String kodeBarang = resultSet.getString("detail_permintaan_pembelian.kode_barang");
			String jumlahDipesan = resultSet.getString("detail_permintaan_pembelian.jumlah_dipesan");
			String unit = resultSet.getString("detail_permintaan_pembelian.unit");

			System.out.println("Nomor Bon      : " + nomorBon);
			System.out.println("Tanggal Bon    : " + tanggalBon);
			System.out.println("Bagian Peminta : " + kodeBagianPeminta);
			System.out.println("Kode Barang    : " + kodeBarang);
			System.out.println("Jumlah dipesan : " + jumlahDipesan);
			System.out.println("Unit           : " + unit);
			System.out.println("Keterangan     : " + keteranganBon);
			System.out.println("--------------------------------------------");
		}
	}
}
