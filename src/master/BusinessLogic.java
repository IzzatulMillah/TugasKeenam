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
}
