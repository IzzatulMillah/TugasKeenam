package master;

import java.sql.SQLException;

public class BlBagian {
	
	public void insertDataBagian(Bagian bagian) throws SQLException {
		bagian.insertBagian();
		System.out.println("insert barang BL berhasil");
	}

	public void updateDataBagian(Bagian bagian) throws SQLException {
		bagian.updateBagian();
		System.out.println("update barang BL berhasil");
	}

	public void deleteDataBagian(Bagian bagian) throws CustomException, SQLException {
		bagian.deleteBagian();
		System.out.println("hapus barang BL berhasil");
	}
}
