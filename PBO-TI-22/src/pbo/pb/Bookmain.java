package pbo.pb;

import java.util.ArrayList;
import java.util.Scanner;

public class Bookmain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Book> listbook = new ArrayList<>();
	 	//222310047 Faiz
		//looping input
		for(int i = 0; i < 3; i++){
			//222310045	Dimas
			System.out.println("Data ke-"+i);
			System.out.print("Masukan judul:");
			String judul = input.nextLine();

			System.out.print("Masukan penulis:");
			String penulis = input.nextLine();

			System.out.print("Masukan penerbit:");
			String penerbit = input.nextLine();

			System.out.print("Masukan tahun:");
			String tahun = input.nextLine();

			System.out.println("\n");
			//set setiap POJO
			listbook.add( new Book(judul, penulis, penerbit, Integer.parseInt(tahun)) );
		}

		//Siti Rohmah 222310054
		int num=1;
		for(Book book : listbook){
			System.out.println("===Book "+ num+"====");
			System.out.println("Judul:"+book.getJudul());
			System.out.println("Penulis:"+book.getPenulis());
			System.out.println("Penerbit:"+book.getPenerbit());
			System.out.println("Tahun:"+book.getTahun());
			num++;
		}
		input.close();
	}

}
