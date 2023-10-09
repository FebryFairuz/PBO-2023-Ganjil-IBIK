package pbo.pa;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TgsBookMainJop {
    public static JOptionPane jop = new JOptionPane();
    public static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        InputMenu();
    }

    private static void InputMenu() {
        String label_menu = "1. Input Buku\n";
        label_menu += "2. Input Buku\n";
        label_menu += "Masukan menu:";
        String chooseMenu = jop.showInputDialog(null, label_menu, "PILIH MENU", jop.QUESTION_MESSAGE);
        if (chooseMenu != null) {
            switch (Integer.parseInt(chooseMenu)) {
                case 1:
                    InputBook();
                    break;
                case 2:
                    OutputBook();
                    break;
                default:
                    jop.showMessageDialog(null, "Menu tidak ditemukan", "ERROR INFO", jop.ERROR_MESSAGE);
                    InputMenu();
                    break;
            }
        } else {
            ConfirmExit();
        }
    }

    private static void ConfirmExit() {
        int confirm = jop.showConfirmDialog(null, "Apakah anda ingin keluar?", "CONFIRM", jop.YES_NO_OPTION);
        System.out.println(confirm);
        if (confirm == 1) {
            InputMenu();
        } else {
            System.exit(0);
        }
        System.out.println(confirm);
    }

    private static void InputBook() {
        String inputJumlahJudulBuku = jop.showInputDialog(null, "Jumlah buku: ", "INPUT BUKU", jop.INFORMATION_MESSAGE);
        if (inputJumlahJudulBuku != null) {
            int JumlahJudulBuku = Integer.parseInt(inputJumlahJudulBuku);

            for (int i = 0; i < JumlahJudulBuku; i++) {
                Book b = new Book();
                String inputJudul = jop.showInputDialog(null, "Masukkan Judul:", "Input Buku ke-" + (i + 1),
                        jop.QUESTION_MESSAGE);
                b.setJudul(inputJudul);
                String penulis = jop.showInputDialog(null, "Masukkan Penulis:", "Input Buku ke-" + (i + 1),
                        jop.QUESTION_MESSAGE);
                b.setPenulis(penulis);
                String penerbit = jop.showInputDialog(null, "Masukkan Penerbit:", "Input Buku ke-" + (i + 1),
                        jop.QUESTION_MESSAGE);
                b.setPenerbit(penerbit);
                books.add(b);
            }

            InputMenu();
        }else{
            ConfirmExit();
        }
    }

    private static void OutputBook() {
        String book = "";
        int num = 1;
        for (Book b : books) {
            book += "Buku ke-" + num + "\n";
            book += "===============\n";
            book += "Judul:" + b.getJudul() + "\n";
            book += "Penulis:" + b.getPenulis() + "\n";
            book += "Penerbit:" + b.getPenerbit() + "\n";
            book += "------------------\n";
            num++;
        }
        jop.showMessageDialog(null, book, "Daftar buku", JOptionPane.PLAIN_MESSAGE);

        InputMenu();
    }

}
