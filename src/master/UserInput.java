package master;

import java.util.Scanner;

public class UserInput {
	
	public UserInput() {}
	
	public void insert() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== INPUT DATA MASTER BARANG =====");
		System.out.print("Nama Barang   : ");
		String inputNama = scan.next();
		System.out.print("Unit Satu     : ");
		String inputUnitSatu = scan.next();
		System.out.print("Konversi Satu : ");
		int inputKonversiSatu = scan.nextInt();
		System.out.print("Unit Dua      : ");
		String inputUnitDua = scan.next();
		System.out.print("Konversi Dua  : ");
		int inputKonversiDua = scan.nextInt();
		System.out.print("Unit Stok     : ");
		String inputUnitStok = scan.next();
		System.out.print("Status Barang : ");
		String inputStatusBarang = scan.next();

		MasterBarang masterBarang = new MasterBarang(inputNama, inputUnitSatu, 
				inputKonversiSatu, inputUnitDua, 
				inputKonversiDua, inputUnitStok, 
				inputStatusBarang);
		masterBarang.insertBarang();
		
		scan.close();
	}
	
	public void update() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===== UPDATE DATA MASTER BARANG =====");
		System.out.print("Kode Barang   : ");
		int inputKode = scan.nextInt();
		System.out.print("Nama Barang   : ");
		String inputNama = scan.next();
		System.out.print("Unit Satu     : ");
		String inputUnitSatu = scan.next();
		System.out.print("Konversi Satu : ");
		int inputKonversiSatu = scan.nextInt();
		System.out.print("Unit Dua      : ");
		String inputUnitDua = scan.next();
		System.out.print("Konversi Dua  : ");
		int inputKonversiDua = scan.nextInt();
		System.out.print("Unit Stok     : ");
		String inputUnitStok = scan.next();
		System.out.print("Status Barang : ");
		String inputStatusBarang = scan.next();
		
		MasterBarang masterBarang = new MasterBarang(inputKode, inputNama, 
				inputUnitSatu, inputKonversiSatu, 
				inputUnitDua, inputKonversiDua, 
				inputUnitStok, inputStatusBarang);
		masterBarang.updateBarang();
		
		scan.close();
	}
	
	public void delete() throws CustomException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===== HAPUS DATA MASTER BARANG =====");
		System.out.print("Masukkan kode barang : ");
		int inputId = scan.nextInt();
		
		MasterBarang masterBarang = new MasterBarang(inputId);
		masterBarang.deleteBarang(inputId);
		
		scan.close();
	}
	
	public void search() throws CustomException {
		
		BarangDaoImpl barangDaoImpl = new BarangDaoImpl();
		
		Scanner scan = new Scanner(System.in);
		
		String namaBarang;
		int kodeBarang;
		
		System.out.println("===== PENCARIAN DATA MASTER BARANG =====");
		System.out.println("1. Berdasarkan kode barang");
		System.out.println("2. Berdasarkan nama barang");
		System.out.print("Pilih data yang akan dimasukkan : ");
		int inputUser = scan.nextInt();
		
		if (inputUser == 1) {
			System.out.print("Masukkan kode barang : ");
			kodeBarang = scan.nextInt();
			barangDaoImpl.searchBarang(kodeBarang);
		} else if (inputUser == 2) {
			System.out.print("Masukkan keyword barang : ");
			namaBarang = scan.next();
			barangDaoImpl.searchBarang(namaBarang);
		} else {
			throw new CustomException("Input tidak ada di menu.");
		}
	}
}
