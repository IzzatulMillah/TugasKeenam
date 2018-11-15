package master;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException, CustomException {
		String ulang;
		Scanner scan = new Scanner(System.in);

//		do {
//			try {
//				showMenu();
//			} catch (CustomException e) {
//				System.out.println(e);
//			} catch (InputMismatchException e) {
//				System.out.println("Maaf inputan anda tidak sesuai");
//			}
//			System.out.print("Ingin mengulang lagi? (y/t) ");
//			ulang = scan.next();
//		} while(ulang.equalsIgnoreCase("y"));
		try{
			TransaksiDAO transaksiDAO = new TransaksiDAO();
			transaksiDAO.getAllHeader();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
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
				showMenuTransaksiPermintaan();
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
		System.out.println("4. hapus Data Master Barang");
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
		System.out.println("4. hapus Data Master Bagian");
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

	public static void showMenuTransaksiPermintaan() throws CustomException {
		PresentationLayer presentationLayer = new PresentationLayer();
		int pilih;

		Scanner scan = new Scanner(System.in);

		System.out.println("\n======== DATA MASTER BAGIAN ========");
		System.out.println("1. DATA MASTER BARANG");
		System.out.println("2. DATA MASTER BAGIAN");
		System.out.println("3. TRANSAKSI PERMINTAAN PEMBELIAN ");
		System.out.print("==> Masukkan pilihan : ");

		pilih = scan.nextInt();

		switch(pilih) {
		case 1 :
			break;
		case 2 :
			break;
		case 3 :
			break;
		case 4 :
			break;
		default :
			throw new CustomException("Maaf, pilihan Anda tidak ada di Menu Utama");
		}
	}
}
