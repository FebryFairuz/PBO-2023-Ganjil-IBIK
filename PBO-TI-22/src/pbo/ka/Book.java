package pbo.ka;

public class Book {
    String judul;
    String penulis;
    String penerbit;

    //POJO => encapsulation
    //setter => input value
    //getter => output value

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
