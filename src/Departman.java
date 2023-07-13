
import java.util.ArrayList;
import java.util.List;

public class Departman {
    
    private String adi;
    private List<Ofis> ofisler;
    private List<Departman> altDepartmanlar;

    public Departman(String adi) {
        this.adi = adi;
        this.ofisler = new ArrayList<>();
        this.altDepartmanlar = new ArrayList<>();
    }


    public String getAdi() {
        return adi;
    }

    public List<Ofis> getOfisler() {
        return ofisler;
    }

    public List<Departman> getAltDepartmanlar() {
        return altDepartmanlar;
    }

    public void ofisEkle(Ofis ofis) {
        ofisler.add(ofis);
    }

    public void ofisSil(Ofis ofis) {
        ofisler.remove(ofis);
    }

    public void altDepartmanEkle(Departman altDepartman) {
        altDepartmanlar.add(altDepartman);
    }

    public void altDepartmanSil(Departman altDepartman) {
        altDepartmanlar.remove(altDepartman);
    }

    public void departmaniListele() {
        System.out.println("Departman: " + adi);
    }

    public void ofisleriListele() {
        System.out.println("Ofisler:");
        for (Ofis ofis : ofisler) {
            System.out.println("Numara: " + ofis.getNumara());
        }
    }

    public void altDepartmanlariListele() {
        System.out.println("Alt Departmanlar:");
        for (Departman altDepartman : altDepartmanlar) {
            System.out.println("Adı: " + altDepartman.getAdi());
        }
    }

    Object getCalisanlar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
