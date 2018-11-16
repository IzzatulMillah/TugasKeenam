package master;

import java.sql.SQLException;

public class TransaksiBL {

	public void input(Transaksi transaksi) throws SQLException, CustomException {
		validasiKodeBagian();
		transaksi.insertPermintaanPembelian();
	}
	
	public void update(Transaksi transaksi) throws SQLException, CustomException {
		validasiKodeBagian();
		transaksi.updatePermintaanPembelian();
	}
	
	public void delete(Transaksi transaksi) throws SQLException, CustomException {
		validasiKodeBagian();
		transaksi.deletePermintaanPembelian();
	}
	
	public void inputDetail(DetailTransaksi detail) throws SQLException {
		detail.insertDetail();
	}
	
	public void updateDetail(DetailTransaksi detail) throws SQLException {
		detail.updateDetail();
	}
	
	public void deleteDetail(DetailTransaksi detail) throws SQLException {
		detail.deleteDetail();
	}
	
	public void validasiKodeBagian() throws SQLException, CustomException {
		BagianDao bagianDao = new BagianDao();
		boolean isExist;
		
		isExist = bagianDao.isKodeBagianExist();
		if(!isExist) {
			throw new CustomException("ERROR", "Kode Bagian tidak ada di database.");
		}
	}
	
	public void validasiNomorBon() {}
	
	public void validasiKodeBarang() {}
	
	public void konversiUnit() {}
	
}
