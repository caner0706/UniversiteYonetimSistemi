
import java.util.ArrayList;
import java.util.List;

public class Ofis {
    
    private int numara;
    private List<Calisan> calisanlar;

    public Ofis(int numara) {
        this.numara = numara;
        this.calisanlar = new ArrayList<>();
    }

    public int getNumara() {
        return numara;
    }

    public List<Calisan> getCalisanlar() {
        return calisanlar;
    }

    public void calisanEkle(Calisan calisan) {
        calisanlar.add(calisan);
    }

    public void calisanSil(Calisan calisan) {
        calisanlar.remove(calisan);
    }

    public void ofisleriListele() {
        System.out.println("Ofis: " + numara);
    }

}
