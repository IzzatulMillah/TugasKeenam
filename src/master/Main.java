package master;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			showMenu();
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void showMenu() throws CustomException {
		int pilih;
		
		Scanner scan = new Scanner(System.in);
		
		BarangDaoImpl barangDaoImpl = new BarangDaoImpl();
		UserInput userInput = new UserInput();

		System.out.println("======== DATA MASTER BARANG ========");
		System.out.println("1. Tampilkan data master barang");
		System.out.println("2. Tambah data master barang");
		System.out.println("3. Ubah data master barang");
		System.out.println("4. Hapus data master barang");
		System.out.println("5. Tampilkan data master barang aktif");
		System.out.println("6. Pencarian barang berdasarkan kode atau nama");
		System.out.print("==> Masukkan pilihan : ");

		pilih = scan.nextInt();

		switch(pilih) {
			case 1 :
				barangDaoImpl.getAllBarang();
				break;
			case 2 :
				userInput.insert();
				break;
			case 3 :
				userInput.update();
				break;
			case 4 :
				userInput.delete();
				break;
			case 5 :
				barangDaoImpl.getAllBarangAktif();
				break;
			case 6 :
				userInput.search();
				break;
			default :
				break;
		}
		
		scan.close();
	}
}
