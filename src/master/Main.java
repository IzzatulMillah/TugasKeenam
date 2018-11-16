package master;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException, CustomException {
		String ulang;
		Scanner scan = new Scanner(System.in);

		do {
			try {
				showMenu();
			} catch (CustomException e) {
				System.out.println(e);
			} catch (InputMismatchException e) {
				System.out.println("Maaf inputan anda tidak sesuai");
			}
			System.out.print("Ingin mengulang lagi? (y/t) ");
			ulang = scan.next();
		} while(ulang.equalsIgnoreCase("y"));
		
//		try{
//			TransaksiDAO transaksiDAO = new TransaksiDAO();
//			transaksiDAO.getAllHeader();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
	}

	public static void showMenu() throws CustomException, InputMismatchException, SQLException{
		int pilih;

		Scanner scan = new Scanner(System.in);

		System.out.println("\n======== DATA MASTER BARANG ========");
		System.out.println("1. DATA MASTER BARANG");
		System.out.println("2. DATA MASTER BAGIAN");
		System.out.println("3. TRANSAKSI PERMINTAAN PEMBELIAN ");
		System.out.print("==> Masukkan pilihan : ");

		pilih = scan.nextInt();

		try {
			switch(pilih) {
			case 1 :
				showMenuBarang();
				break;
			case 2 :
				showMenuBagian();
				break;
			case 3 :
				showMenuTransaksi();
				break;
			default :
				throw new CustomException("Maaf, pilihan Anda tidak ada di Menu Utama");
			}
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (CustomException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void showMenuBarang() throws CustomException, SQLException {
		PresentationLayer presentationLayer = new PresentationLayer();
		Barang barang;
		BlBarang blBarang =  new BlBarang();
		int pilih;

		Scanner scan = new Scanner(System.in);

		System.out.println("\n======== DATA MASTER BARANG ========");
		System.out.println("1. Tampilkan Data Master Barang");
		System.out.println("2. Tambah Data Master Barang");
		System.out.println("3. Ubah Data Master Barang");
		System.out.println("4. Hapus Data Master Barang");
		System.out.print("==> Masukkan pilihan : ");

		pilih = scan.nextInt();

		switch(pilih) {
		case 1 :
			BarangDao barangDao = new BarangDao();
			barangDao.getAllBarang();
			break;
		case 2 :
			barang = presentationLayer.insertBarang();
			blBarang.insertDataBarang(barang);
			break;
		case 3 :
			barang = presentationLayer.updateBarang();
			blBarang.updateDataBarang(barang);
			break;
		case 4 :
			barang = presentationLayer.deleteBarang();
			blBarang.deleteDataBarang(barang);
			break;
		default :
			throw new CustomException("Maaf, pilihan Anda tidak ada di Menu Utama");
		}
	}

	public static void showMenuBagian() throws CustomException, SQLException {
		PresentationLayer presentationLayer = new PresentationLayer();
		Bagian bagian;
		BlBagian blBagian = new BlBagian();
		int pilih;

		Scanner scan = new Scanner(System.in);

		System.out.println("\n======== DATA MASTER BAGIAN ========");
		System.out.println("1. Tampilkan Data Master Bagian");
		System.out.println("2. Tambah Data Master Bagian");
		System.out.println("3. Ubah Data Master Bagian");
		System.out.println("4. Hapus Data Master Bagian");
		System.out.print("==> Masukkan pilihan : ");

		pilih = scan.nextInt();

		switch(pilih) {
		case 1 :
			BagianDao bagianDao = new BagianDao();
			bagianDao.getAllBagian();
			break;
		case 2 :
			bagian = presentationLayer.insertBagian();
			blBagian.insertDataBagian(bagian);
			break;
		case 3 :
			bagian = presentationLayer.updateBagian();
			blBagian.updateDataBagian(bagian);
			break;
		case 4 :
			bagian = presentationLayer.deleteBagian();
			blBagian.deleteDataBagian(bagian);
			break;
		default :
			throw new CustomException("Maaf, pilihan Anda tidak ada di Menu Utama");
		}
	}

	public static void showMenuTransaksi() throws CustomException, SQLException {
		int pilih;

		Scanner scan = new Scanner(System.in);

		System.out.println("\n======== DATA TRANSAKSI PERMINTAAN PEMBELIAN ========");
		System.out.println("1. DATA PERMINTAAN PEMBELIAN");
		System.out.println("2. DATA DETAIL PERMINTAAN PEMBELIAN");
		System.out.print("==> Masukkan pilihan : ");

		pilih = scan.nextInt();

		switch(pilih) {
		case 1 :
			showPermintaan();
			break;
		case 2 :
			showDetail();
			break;
		default :
			throw new CustomException("Maaf, pilihan Anda tidak ada di Menu Utama");
		}
	}
	
	public static void showPermintaan() throws SQLException, CustomException {
		Transaksi transaksi;
		PresentationLayer presentationLayer = new PresentationLayer();
		BlTransaksi blTransaksi = new BlTransaksi();
		int pilih;

		Scanner scan = new Scanner(System.in);

		System.out.println("\n======== DATA PERMINTAAN PEMBELIAN ========");
		System.out.println("1. Tampilkan Data Permintaan Pembelian");
		System.out.println("2. Tambah Data Permintaan Pembelian");
		System.out.println("3. Ubah Data Permintaan Pembelian");
		System.out.println("4. Hapus Data Permintaan Pembelian");
		System.out.print("==> Masukkan pilihan : ");

		pilih = scan.nextInt();

		switch(pilih) {
		case 1 :
			TransaksiDAO transaksiDAO = new TransaksiDAO();
			transaksiDAO.getAllTransaksi();
			break;
		case 2 :
			transaksi = presentationLayer.insertTransaksi();
			blTransaksi.input(transaksi);
			break;
		case 3 :
			transaksi = presentationLayer.insertTransaksi();
			blTransaksi.update(transaksi);
			break;
		case 4 :
			transaksi = presentationLayer.insertTransaksi();
			blTransaksi.delete(transaksi);
			break;
		default :
			throw new CustomException("Maaf, pilihan Anda tidak ada di Menu Utama");
		}
	}
	
	public static void showDetail() throws SQLException, CustomException {
		DetailTransaksi detailTransaksi;
		PresentationLayer presentationLayer = new PresentationLayer();
		BlTransaksi blTransaksi = new BlTransaksi();
		int pilih;

		Scanner scan = new Scanner(System.in);

		System.out.println("\n====== DATA DETAIL PERMINTAAN PEMBELIAN ======");
		System.out.println("1. Tampilkan Detail Permintaan Pembelian");
		System.out.println("2. Tambah Detail Permintaan Pembelian");
		System.out.println("3. Ubah Detail Permintaan Pembelian");
		System.out.println("4. Hapus Detail Permintaan Pembelian");
		System.out.print("==> Masukkan pilihan : ");

		pilih = scan.nextInt();
		
		switch(pilih) {
		case 1 :
			TransaksiDAO transaksiDAO = new TransaksiDAO();
			transaksiDAO.getAllHeaderDetail();
			break;
		case 2 :
			detailTransaksi = presentationLayer.insertDetail();
			blTransaksi.inputDetail(detailTransaksi);
			break;
		case 3 :
			detailTransaksi = presentationLayer.updateDetail();
			blTransaksi.updateDetail(detailTransaksi);
			break;
		case 4 :
			detailTransaksi = presentationLayer.deleteDetail();
			blTransaksi.deleteDetail(detailTransaksi);
			break;
		default :
			throw new CustomException("Maaf, pilihan Anda tidak ada di Menu Utama");
		}
	}
}
