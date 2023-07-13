
import java.util.ArrayList;
import java.util.List;

public class SinifOdasi {
    
    private String adi;
    private int kapasite;
    private int numara;
    private List<Ogrenci> ogrenciler;

    public SinifOdasi(String adi, int kapasite) {
        this.adi = adi;
        this.kapasite = kapasite;
        this.ogrenciler = new ArrayList<>();
    }


    public String getAdi() {
        return adi;
    }

    public int getKapasite() {
        return kapasite;
    }

    public void ogrenciEkle(Ogrenci ogrenci) {
        ogrenciler.add(ogrenci);
    }

    public void ogrenciSil(Ogrenci ogrenci) {
        ogrenciler.remove(ogrenci);
    }

    public void sinifiListele() {
        System.out.println("Sinif Odasi: " + adi);
        System.out.println("Kapasite: " + kapasite);
        System.out.println("Numara: " + numara);
        System.out.println("Ogrenciler:");
        for (Ogrenci ogrenci : ogrenciler) {
            System.out.println("Adı: " + ogrenci.getAdi() + ", Ogrenci No: " + ogrenci.getOgrenciNo());
        }
    }

}
