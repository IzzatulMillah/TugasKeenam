package master;

import java.util.List;

public interface BarangDao {
	public List<MasterBarang> getAllBarang();
	public List<MasterBarang> getAllBarangAktif();
	public MasterBarang getBarang(int kodeBarang);
	public MasterBarang getBarang(String namaBarang);
}
