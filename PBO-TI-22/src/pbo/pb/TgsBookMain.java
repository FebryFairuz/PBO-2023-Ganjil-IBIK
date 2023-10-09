package pbo.pb;

import java.util.ArrayList;
import java.util.Scanner;

public class TgsBookMain {
	public static ArrayList<Book> listbook = new ArrayList<>();
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		InputMenu();
		input.close();
	}

	public static void InputMenu() {
		System.out.println("====Pilih Menu====");
		System.out.println("1. Input Buku");
		System.out.println("2. Output Buku");
		System.out.println("---------------");
		System.out.print("Masukan menu:");
		String chooseMenu = input.nextLine();
		System.out.println("================");
		switch (Integer.parseInt(chooseMenu)) {
			case 1:
				InputBook();
				break;
			case 2:
				OutputBook();
				break;
			default:
				System.out.println("Menu tidak ditemukan");
				break;
		}

	}

	public static void InputBook() {
		System.out.println("#Input Buku#");
		System.out.println("------------------");
		System.out.print("Masukan jumlah buku:");
		String jmlBook = input.nextLine();
		int jml_book = Integer.parseInt(jmlBook);
		System.out.println("\n------------------");
		for (int i = 0; i < jml_book; i++) {
			System.out.println("=Data buku ke-" + (i+1) + "=");
			System.out.print("\tMasukan judul:");
			String judul = input.nextLine();

			System.out.print("\tMasukan penulis:");
			String penulis = input.nextLine();

			System.out.print("\tMasukan penerbit:");
			String penerbit = input.nextLine();

			System.out.print("\tMasukan tahun:");
			String tahun = input.nextLine();

			System.out.println("------------------");
			listbook.add(new Book(judul, penulis, penerbit, Integer.parseInt(tahun)));
		}
		System.out.println("\n");

		InputMenu();
	}

	public static void OutputBook() {
		int num = 1;
		if (listbook.size() > 0) {
			for (Book book : listbook) {
				System.out.println("===Book " + num + "====");
				System.out.println("\tJudul:" + book.getJudul());
				System.out.println("\tPenulis:" + book.getPenulis());
				System.out.println("\tPenerbit:" + book.getPenerbit());
				System.out.println("\tTahun:" + book.getTahun());
				num++;
			}
		} else {
			System.out.println("\n---Data buku kosong---");
		}
		System.out.println("\n");

		InputMenu();
	}
}
