package hu.bankproject;

public class MegtakaritasiSzamla extends Szamla {

    private  double kamat;
    public static double alapKamat = 0.5;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }
    public boolean kivesz (int osszeg){
        return super.kivesz(osszeg);
    }
    public void kamatJovairas(){
        kamat = alapKamat*aktualisEgyenleg;
        aktualisEgyenleg += kamat;
    }

}
