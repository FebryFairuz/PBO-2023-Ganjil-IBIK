package pbo.pb;

public class Book {
	String judul;
	String penulis;
	String penerbit;
	int tahun;

	public Book(String judul, String penulis, String penerbit, int tahun) {
		this.judul = judul;
		this.penulis = penulis;
		this.penerbit = penerbit;
		this.tahun = tahun; 
	}

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

	public int getTahun() {
		return tahun;
	}

	public void setTahun(int tahun) {
		this.tahun = tahun;
	}

}
