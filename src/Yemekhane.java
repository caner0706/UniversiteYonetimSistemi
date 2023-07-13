
import java.util.ArrayList;
import java.util.List;

public class Yemekhane {
    
    private List<Yemek> yemekler;

    public Yemekhane() {
        this.yemekler = new ArrayList<>();
    }

    public void yemekEkle(Yemek yemek) {
        yemekler.add(yemek);
    }

    public void yemekSil(Yemek yemek) {
        yemekler.remove(yemek);
    }

    public void yemekleriListele() {
        System.out.println("Yemekhane Yemekleri:");
        for (Yemek yemek : yemekler) {
            System.out.println("Yemek Adı: " + yemek.getAdi());
        }
    }

}
