package master;

import java.sql.SQLException;

public class BusinessLogic {
	
	BarangDao barangDao = new BarangDao();
	
	public BusinessLogic() {
		
	}
	
	public boolean validasiBarangAktif(String kodeBarang) throws SQLException {
		String status;
		
		status = barangDao.getStatusBarang(kodeBarang);
		if(status.equalsIgnoreCase("aktif")) {
			return true;
		} else {
			return false;
		}
	}
}
