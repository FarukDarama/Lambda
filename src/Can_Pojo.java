public class Can_Pojo {
    private String kursAdi;
    private String  sezon;
    private  int ortPuan;
    private int ogrNum;

    public String getKursAdi() {
        return kursAdi;
    }

    public void setKursAdi(String kursAdi) {
        this.kursAdi = kursAdi;
    }

    public String getSezon() {
        return sezon;
    }

    public void setSezon(String sezon) {
        this.sezon = sezon;
    }

    public int getOrtPuan() {
        return ortPuan;
    }

    public void setOrtPuan(int ortPuan) {
        this.ortPuan = ortPuan;
    }

    public int getOgrNum() {
        return ogrNum;
    }

    public void setOgrNum(int ogrNum) {
        this.ogrNum = ogrNum;
    }

    public Can_Pojo() {
    }

    public Can_Pojo(String kursAdi, String sezon, int ortPuan, int ogrNum) {

        this.kursAdi = kursAdi;
        this.sezon = sezon;
        this.ortPuan = ortPuan;
        this.ogrNum = ogrNum;
    }

    @Override
    public String toString() {
        return "Can_Pojo{" +
                "kursAdi='" + kursAdi + '\'' +
                ", sezon='" + sezon + '\'' +
                ", ortPuan=" + ortPuan +
                ", ogrNum=" + ogrNum +
                '}';
    }
}
