package pbo.pa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MainBook {
    public static void main(String[] args) {

        JOptionPane jop = new JOptionPane();
        // agnes
        ArrayList<Book> books = new ArrayList<>();
        //Sandry
        String inputJumlahJudulBuku = JOptionPane.showInputDialog("Masukkan jumah judul buku = ");
        int JumlahJudulBuku = Integer.parseInt(inputJumlahJudulBuku);
        
        for(int i = 0; i < JumlahJudulBuku; i++){
            Book b = new Book();
            //nicholas
            String inputJudul = JOptionPane.showInputDialog("Masukkan Judul:");
            String penulis = JOptionPane.showInputDialog("Masukkan Penulis : ");
            String penerbit = JOptionPane.showInputDialog("Masukkan Penerbit : ");
            
            //insert to POJO book
            b.setJudul(inputJudul);
            b.setPenulis(penulis);
            b.setPenerbit(penerbit);

            // add to arraylist
            books.add(b);
        }

        // books.add("pbo");
        // books.add("db");
        // books.add("jarkom");

        // jop.showMessageDialog(null, "list books"); 
        //agatha
        // output Arraylist
        String book = "";
        // for (int i = 0; i < books.size(); i++) {
        //     System.out.println("book[" + i + "]=" + books.get(i));
        //     book += "-"+books.get(i) + "\n";
        // }

        int num = 1;
        for(Book b : books){
            book += "Buku ke-"+num+"\n";
            book += "===============\n";
            book += "Judul:"+ b.getJudul()+"\n";
            book += "Penulis:"+ b.getPenulis()+"\n";
            book += "Penerbit:"+ b.getPenerbit()+"\n";
            book += "------------------\n";
            num++;
        }
        JOptionPane.showMessageDialog(null, book,"Daftar buku", JOptionPane.PLAIN_MESSAGE);

    }

}
