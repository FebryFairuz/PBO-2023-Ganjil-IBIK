package pbo.ka;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        // input
        // books.add("PBO");
        // books.add("Basis Data");

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Masukan judul:");
            String judul = input.nextLine();
            System.out.print("Masukan penerbit:");
            String penerbit = input.nextLine();
            System.out.print("Masukan penulis:");
            String penulis = input.nextLine();

            Book b = new Book();
            b.setJudul(judul);
            b.setPenerbit(penerbit);
            b.setPenulis(penulis);
            books.add(b);
        }

        // output
        // by index
        // System.out.println(books.get(1));
        // System.out.println(books.size());
        // for(int i=0; i<books.size(); i++){
        // System.out.println("Book ke-"+i+"="+books.get(i));
        // }

        int num = 1;
        for (Book b2 : books) {
            System.out.println("==Book ke-" + num + "==");
            System.out.println("Judul:" + b2.getJudul());
            System.out.println("Penerbit:" + b2.getPenerbit());
            System.out.println("Penulis:" + b2.getPenulis());
            num++;
        }

        input.close();
    }
}
