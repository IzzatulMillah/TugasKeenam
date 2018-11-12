package master;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("===== INPUT DATA KARYAWAN =====");
		System.out.print("Nama : ");
		String inputNama = scan.next();
		System.out.print("Unit Satu : ");
		String inputUnitSatu = scan.next();
		System.out.print("Konversi Satu : ");
		int inputKonversiSatu = scan.nextInt();
		System.out.print("Unit Dua : ");
		String inputUnitDua = scan.next();
		System.out.print("Konversi Dua : ");
		int inputKonversiDua = scan.nextInt();
		System.out.print("Unit Stok : ");
		String inputUnitStok = scan.next();
		System.out.print("Status Barang : ");
		String inputStatusBarang = scan.next();
		
		MasterBarang masterBarang = new MasterBarang(inputNama, inputUnitSatu, 
				inputKonversiSatu, inputUnitDua, 
				inputKonversiDua, inputUnitStok, 
				inputStatusBarang);
		masterBarang.insertBarang();
	}

}
