package master;

public interface BarangDao {
	public void getAllBarang();
	public void getAllBarangAktif();
	public void searchBarang(int kodeBarang);
	public void searchBarang(String namaBarang);
	public String getStatusBarang(int kodeBarang);
}
