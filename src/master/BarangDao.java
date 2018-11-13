package master;

public interface BarangDao {
	public void getAllBarang();
	public void getAllBarangAktif();
	public void searchBarang(int kodeBarang);
	public void searchBarang(String namaBarang);
	public int getIdBarang();
	public String getStatusBarang(int kodeBarang);
}
