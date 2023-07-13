
import java.util.ArrayList;
import java.util.List;

public class Kutuphane {
    
    private List<Kitap> kitaplar;

    public Kutuphane() {
        this.kitaplar = new ArrayList<>();
    }

    public void kitapEkle(Kitap kitap) {
        kitaplar.add(kitap);
    }

    public void kitapSil(Kitap kitap) {
        kitaplar.remove(kitap);
    }

    public void kitaplariListele() {
        System.out.println("Kütüphane Kitapları:");
        for (Kitap kitap : kitaplar) {
            System.out.println("Kitap Adı: " + kitap.getAdi() + ", Yazar: " + kitap.getYazar());
        }
    }

}
