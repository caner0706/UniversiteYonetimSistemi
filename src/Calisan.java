public class Calisan {
    
    private String adi;
    private String pozisyon;
    private Departman departman;

    public Calisan(String adi, String pozisyon) {
        this.adi = adi;
        this.pozisyon = pozisyon;
    }

    public String getAdi() {
        return adi;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public Departman getDepartman() {
        return departman;
    }

    public void setDepartman(Departman departman) {
        this.departman = departman;
    }

    public void calis() {
        System.out.println(adi + " çalışıyor...");
    }

    public void istifaEt() {
        System.out.println(adi + " istifa etti!");
    }

    public void departmanDegistir(Departman yeniDepartman) {
        if (departman != null) {
            departman.getCalisanlar();
        }
        this.departman = yeniDepartman;
        if (yeniDepartman != null) {
            yeniDepartman.getCalisanlar();
        }
    }

}
