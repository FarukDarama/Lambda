public class Apartman {
    private String cephe;
    private int katSayis;
    private int kira;

    //parametresiz cons
    public Apartman() {
    }

    //bol parametreli cons


    public Apartman(String cephe, int katSayis, int kira) {
        this.cephe = cephe;
        this.katSayis = katSayis;
        this.kira = kira;
    }

    @Override
    public String toString() {
        return "Apartman{" +
                "cephe='" + cephe + '\'' +
                ", katSayis=" + katSayis +
                ", kira=" + kira +
                '}';
    }

    public String getCephe() {
        return cephe;
    }

    public void setCephe(String cephe) {
        this.cephe = cephe;
    }

    public int getKatSayis() {
        return katSayis;
    }

    public void setKatSayis(int katSayis) {
        this.katSayis = katSayis;
    }

    public int getKira() {
        return kira;
    }

    public void setKira(int kira) {
        this.kira = kira;
    }







}
