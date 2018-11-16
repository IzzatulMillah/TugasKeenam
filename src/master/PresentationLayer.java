package master;

import java.util.Scanner;

public class PresentationLayer {

	public PresentationLayer() {
		
	}

	public Barang insertBarang() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== INPUT DATA MASTER BARANG =====");
		System.out.print("Kode Barang   : ");
		String inputKode = scan.nextLine();
		System.out.print("Nama Barang   : ");
		String inputNama = scan.nextLine();
		System.out.print("Unit Satu     : ");
		String inputUnitSatu = scan.next();
		System.out.print("Konversi Satu : ");
		double inputKonversiSatu = scan.nextDouble();
		System.out.print("Unit Dua      : ");
		String inputUnitDua = scan.next();
		System.out.print("Konversi Dua  : ");
		double inputKonversiDua = scan.nextDouble();
		System.out.print("Unit Stok     : ");
		String inputUnitStok = scan.next();
		System.out.print("Aktif (y/n)   : ");
		String inputStatusBarang = scan.next();
		
		Barang masterBarang = new Barang(inputKode, inputNama, 
										 inputUnitSatu, inputKonversiSatu, 
										 inputUnitDua, inputKonversiDua, 
										 inputUnitStok, inputStatusBarang);
		return masterBarang;
	}

	public Barang updateBarang() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== UPDATE DATA MASTER BARANG =====");
		System.out.print("Kode Barang   : ");
		String inputKode = scan.nextLine();
		System.out.print("Nama Barang   : ");
		String inputNama = scan.nextLine();
		System.out.print("Unit Satu     : ");
		String inputUnitSatu = scan.nextLine();
		System.out.print("Konversi Satu : ");
		int inputKonversiSatu = scan.nextInt();
		System.out.print("Unit Dua      : ");
		String inputUnitDua = scan.nextLine();
		System.out.print("Konversi Dua  : ");
		int inputKonversiDua = scan.nextInt();
		System.out.print("Unit Stok     : ");
		String inputUnitStok = scan.nextLine();
		System.out.print("Aktif (y/n)   : ");
		String inputStatusBarang = scan.nextLine();

		Barang masterBarang = new Barang(inputKode, inputNama, 
				inputUnitSatu, inputKonversiSatu, 
				inputUnitDua, inputKonversiDua, 
				inputUnitStok, inputStatusBarang);
		return masterBarang;
	}

	public Barang deleteBarang() throws CustomException {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== HAPUS DATA MASTER BARANG =====");
		System.out.print("Masukkan kode barang : ");
		String inputId = scan.next();

		Barang masterBarang = new Barang(inputId, null, null, 0, null, 0, null, null);
		return masterBarang;
	}

	public String searchBarang() throws CustomException {
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
			return kodeBarang;
		} else if (inputUser == 2) {
			System.out.print("Masukkan keyword barang : ");
			namaBarang = scan.nextLine();
			return namaBarang;
		} else {
			throw new CustomException("Input tidak ada di menu.");
		}
	}

	public Bagian insertBagian() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== INPUT DATA MASTER BAGIAN =====");
		System.out.print("Kode Bagian   : ");
		String inputKode = scan.nextLine();
		System.out.print("Nama Bagian   : ");
		String inputNama = scan.nextLine();
		
		Bagian bagian = new Bagian(inputKode, inputNama);
		return bagian;
	}

	public Bagian updateBagian() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== INPUT DATA MASTER BAGIAN =====");
		System.out.print("Kode Bagian   : ");
		String inputKode = scan.nextLine();
		System.out.print("Nama Bagian   : ");
		String inputNama = scan.nextLine();

		Bagian bagian = new Bagian(inputKode, inputNama);
		return bagian;
	}

	public Bagian deleteBagian() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== HAPUS DATA MASTER BAGIAN =====");
		System.out.print("Masukkan kode bagian : ");
		String inputKode = scan.next();

		Bagian bagian = new Bagian(inputKode, null);
		return bagian;
	}
	
	public Transaksi insertTransaksi() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== INPUT DATA TRANSAKSI =====");
		System.out.print("Nomor Bon           : ");
		int inputNomorBon = scan.nextInt();
		scan.nextLine();
		System.out.print("Tanggal Bon         : ");
		String inputTanggal = scan.nextLine();
		System.out.print("Kode Bagian Peminta : ");
		String inputKodeBagian = scan.nextLine();
		System.out.print("Keterangan          : ");
		String inputKeterangan = scan.nextLine();

		Transaksi pembelian = new Transaksi(inputNomorBon, inputTanggal, inputKodeBagian, inputKeterangan);
		return pembelian;
	}
	
	public DetailTransaksi insertDetail() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== INPUT DETAIL TRANSAKSI =====");
		System.out.print("Nomor Bon      : ");
		int inputNomorBon = scan.nextInt();
		System.out.print("Kode Barang    : ");
		String inputKodeBarang = scan.next();
		System.out.print("Jumlah dipesan : ");
		double inputJumlahPesan = scan.nextDouble();
		System.out.print("Unit           : ");
		String inputUnit = scan.next();
		
		DetailTransaksi dPembelian = new DetailTransaksi(inputNomorBon, inputKodeBarang, 
				inputJumlahPesan, inputUnit, 0, null);
		return dPembelian;
	}
	
	public Transaksi updateTransaksi() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== UPDATE DATA TRANSAKSI =====");
		System.out.print("Nomor Bon           : ");
		int inputNomorBon = scan.nextInt();
		scan.nextLine();
		System.out.print("Tanggal Bon         : ");
		String inputNama = scan.nextLine();
		System.out.print("Kode Bagian Peminta : ");
		String inputKodeBagian = scan.nextLine();
		System.out.print("Keterangan          : ");
		String inputKeterangan = scan.nextLine();

		Transaksi pembelian = new Transaksi(inputNomorBon, inputNama, inputKodeBagian, inputKeterangan);
		return pembelian;
	}
	
	public DetailTransaksi updateDetail() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== UPDATE DETAIL TRANSAKSI =====");
		System.out.print("Nomor Bon      : ");
		int inputNomorBon = scan.nextInt();
		System.out.print("Kode Barang    : ");
		String inputKodeBarang = scan.next();
		System.out.print("Jumlah dipesan : ");
		double inputJumlahPesan = scan.nextDouble();
		System.out.print("Unit           : ");
		String inputUnit = scan.next();
		
		DetailTransaksi dPembelian = new DetailTransaksi(inputNomorBon, inputKodeBarang, 
				inputJumlahPesan, inputUnit, 0, null);
		return dPembelian;
	}
	
	public Transaksi deleteTransaksi() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== DELETE DATA TRANSAKSI =====");
		System.out.print("Nomor Bon           : ");
		int inputNomorBon = scan.nextInt();

		Transaksi pembelian = new Transaksi(inputNomorBon, null, null, null);
		return pembelian;
	}
	
	public DetailTransaksi deleteDetail() {
		Scanner scan = new Scanner(System.in);

		System.out.println("===== DELETE DETAIL TRANSAKSI =====");
		System.out.print("Nomor Bon      : ");
		int inputNomorBon = scan.nextInt();
		
		DetailTransaksi dPembelian = new DetailTransaksi(inputNomorBon, null, 0, null, 0, null);
		return dPembelian;
	}
}
