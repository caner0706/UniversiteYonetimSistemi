import java.util.ArrayList;
import java.util.List;


public class Universite {
    
    private String adi;
    private List<SinifOdasi> siniflar;
    private List<Calisan> calisanlar;
    private List<Departman> departmanlar;
    private Yemekhane yemekhane;
    private Kutuphane kutuphane;

    public Universite(String adi) {
        this.adi = adi;
        this.siniflar = new ArrayList<>();
        this.calisanlar = new ArrayList<>();
        this.departmanlar = new ArrayList<>();
        this.yemekhane = new Yemekhane();
        this.kutuphane = new Kutuphane();
    }

    public void sinifEkle(String adi, int kapasite) {
        SinifOdasi sinif = new SinifOdasi(adi, kapasite);
        siniflar.add(sinif);
    }

    public void sinifSil(String adi) {
        SinifOdasi sinif = sinifBul(adi);
        if (sinif != null) {
            siniflar.remove(sinif);
        }
    }

    public void calisanEkle(String adi, String pozisyon) {
        Calisan calisan = new Calisan(adi, pozisyon);
        calisanlar.add(calisan);
    }

    public void calisanSil(String adi) {
        Calisan calisan = calisanBul(adi);
        if (calisan != null) {
            calisanlar.remove(calisan);
        }
    }

    public void departmanEkle(String adi) {
        Departman departman = new Departman(adi);
        departmanlar.add(departman);
    }

    public void departmanSil(String adi) {
        Departman departman = departmanBul(adi);
        if (departman != null) {
            departmanlar.remove(departman);
        }
    }

    public void siniflariListele() {
        System.out.println("Siniflar:");
        for (SinifOdasi sinif : siniflar) {
            System.out.println("Adı: " + sinif.getAdi() + ", Kapasite: " + sinif.getKapasite());
        }
    }

    public void calisanlariListele() {
        System.out.println("Calisanlar:");
        for (Calisan calisan : calisanlar) {
            System.out.println("Adı: " + calisan.getAdi() + ", Pozisyon: " + calisan.getPozisyon());
        }
    }

    public void departmanlariListele() {
        System.out.println("Departmanlar:");
        for (Departman departman : departmanlar) {
            System.out.println("Adı: " + departman.getAdi());
        }
    }

    public Yemekhane getYemekhane() {
        return yemekhane;
    }

    public Kutuphane getKutuphane() {
        return kutuphane;
    }

    private SinifOdasi sinifBul(String adi) {
        for (SinifOdasi sinif : siniflar) {
            if (sinif.getAdi().equals(adi)) {
                return sinif;
            }
        }
        return null;
    }

    private Calisan calisanBul(String adi) {
        for (Calisan calisan : calisanlar) {
            if (calisan.getAdi().equals(adi)) {
                return calisan;
            }
        }
        return null;
    }

    private Departman departmanBul(String adi) {
        for (Departman departman : departmanlar) {
            if (departman.getAdi().equals(adi)) {
                return departman;
            }
        }
        return null;
    }
}
