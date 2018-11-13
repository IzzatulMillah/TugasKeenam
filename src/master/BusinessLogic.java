package master;

public class BusinessLogic {
	
	BarangDaoImpl barangDaoImpl = new BarangDaoImpl();
	
	public BusinessLogic() {
		
	}
	
	public boolean validasiBarangAktif(int kodeBarang) {
		String status;
		
		status = barangDaoImpl.getStatusBarang(kodeBarang);
		if(status.equalsIgnoreCase("aktif")) {
			return true;
		} else {
			return false;
		}
	}
	
	public void validasiKodeBarang() {
		// TODO 2 jika barang ada, maka showdata
		// jika tidak ada, maka tampilkan barang yang dicari tidak ditemukan
	}
	
	public void validasiNamaBarang() {}
}
