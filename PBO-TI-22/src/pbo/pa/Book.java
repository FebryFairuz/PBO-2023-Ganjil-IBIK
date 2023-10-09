package pbo.pa;

public class Book {
    String judul;
    String penulis;
    String penerbit;

    // public Book(String judul, String penulis, String penerbit){
    //     this.judul = judul;
    //     this.penulis = penulis;
    //     this.penerbit = penerbit;
    // }

    //POJO
    //setter => input value & getter => output value

    public String getJudul() {
        return judul;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getPenulis() {
        return penulis;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public String getPenerbit() {
        return penerbit;
    }
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

}
