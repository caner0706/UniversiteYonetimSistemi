public class Main {
    
    public static void main(String[] args) {
        Universite universite = new Universite("ABC Üniversitesi");

        universite.sinifEkle("A101", 30);
        universite.sinifEkle("B202", 25);
        universite.siniflariListele();

        universite.calisanEkle("John Doe", "Profesör");
        universite.calisanEkle("Jane Smith", "Memur");
        universite.calisanlariListele();

        universite.departmanEkle("Bilgisayar Mühendisliği");
        universite.departmanEkle("İnşaat Mühendisliği");
        universite.departmanlariListele();

        Yemekhane yemekhane = universite.getYemekhane();
        yemekhane.yemekEkle(new Yemek("Pilav"));
        yemekhane.yemekEkle(new Yemek("Makarna"));
        yemekhane.yemekleriListele();

        Kutuphane kutuphane = universite.getKutuphane();
        kutuphane.kitapEkle(new Kitap("Harry Potter", "J.K. Rowling"));
        kutuphane.kitapEkle(new Kitap("Lord of the Rings", "J.R.R. Tolkien"));
        kutuphane.kitaplariListele();
    }
}
