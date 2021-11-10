public class Isci {
    String ad;
    String soyad;
    int maas;

    public Isci() {
        System.out.println(getAd());
        System.out.println(getSoyad());
    }

    @Override
    public String toString() {
        return "Isci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", maas=" + maas +
                '}';
    }

    public Isci(String ad, String soyad, int maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
}
