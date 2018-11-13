package master;

public interface BarangDao {
	public void getAllBarang();
	public void getAllBarangAktif();
	public void getBarang(int kodeBarang);
	public void getBarang(String namaBarang);
	public int getIdBarang();
	public String getStatusBarang(int kodeBarang);
}
