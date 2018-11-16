package master;

import java.sql.SQLException;

public class BlTransaksi {

	public void input(Transaksi transaksi) throws SQLException {
		transaksi.insertPermintaanPembelian();
	}
	
	public void update(Transaksi transaksi) throws SQLException {
		transaksi.updatePermintaanPembelian();
	}
	
	public void delete(Transaksi transaksi) throws SQLException {
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
	
	public void validasiKodeBagian() {}
	
	public void validasiNomorBon() {}
	
	public void validasiKodeBarang() {}
	
	public void konversiUnit() {}
	
}
