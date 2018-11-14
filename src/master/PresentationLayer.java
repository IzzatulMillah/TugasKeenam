package master;

import java.util.Scanner;

public class PresentationLayer {

	public PresentationLayer() {}

	public Barang insert() {
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

		scan.close();

		Barang masterBarang = new Barang(null, inputNama, inputUnitSatu, 
				inputKonversiSatu, inputUnitDua, 
				inputKonversiDua, inputUnitStok, 
				inputStatusBarang);
		return masterBarang;
	}

	public Barang update() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== UPDATE DATA MASTER BARANG =====");
		System.out.print("Kode Barang   : ");
		String inputKode = scan.next();
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

		scan.close();

		Barang masterBarang = new Barang(inputKode, inputNama, 
				inputUnitSatu, inputKonversiSatu, 
				inputUnitDua, inputKonversiDua, 
				inputUnitStok, inputStatusBarang);
		return masterBarang;
	}

	public Barang delete() throws CustomException {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== HAPUS DATA MASTER BARANG =====");
		System.out.print("Masukkan kode barang : ");
		String inputId = scan.next();

		scan.close();

		Barang masterBarang = new Barang(inputId, null, null, 0, null, 0, null, null);
		return masterBarang;
	}

	public String search() throws CustomException {
		Scanner scan = new Scanner(System.in);

		String namaBarang;
		String kodeBarang;

		System.out.println("===== PENCARIAN DATA MASTER BARANG =====");
		System.out.println("1. Berdasarkan kode barang");
		System.out.println("2. Berdasarkan nama barang");
		System.out.print("Pilih data yang akan dimasukkan : ");
		int inputUser = scan.nextInt();

		if (inputUser == 1) {
			System.out.print("Masukkan kode barang : ");
			kodeBarang = scan.next();
			scan.close();
			return kodeBarang;
		} else if (inputUser == 2) {
			System.out.print("Masukkan keyword barang : ");
			namaBarang = scan.next();
			scan.close();
			return namaBarang;
		} else {
			scan.close();
			throw new CustomException("Input tidak ada di menu.");
		}
	}

	public Bagian insertBagian() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== INPUT DATA MASTER BAGIAN =====");
		System.out.print("Kode Bagian   : ");
		String inputKode = scan.next();
		System.out.print("Nama Bagian   : ");
		String inputNama = scan.next();

		scan.close();

		Bagian bagian = new Bagian(inputKode, inputNama);
		return bagian;
	}

	public Bagian updateBagian() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== INPUT DATA MASTER BAGIAN =====");
		System.out.print("Kode Bagian   : ");
		String inputKode = scan.next();
		System.out.print("Nama Bagian   : ");
		String inputNama = scan.next();

		scan.close();

		Bagian bagian = new Bagian(inputKode, inputNama);
		return bagian;
	}

	public Bagian deleteBagian() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== HAPUS DATA MASTER BAGIAN =====");
		System.out.print("Masukkan kode bagian : ");
		String inputKode = scan.next();

		scan.close();

		Bagian bagian = new Bagian(inputKode, null);
		return bagian;
	}
}
