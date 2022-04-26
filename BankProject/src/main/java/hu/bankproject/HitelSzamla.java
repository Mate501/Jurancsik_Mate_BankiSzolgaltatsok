package hu.bankproject;

public class HitelSzamla extends Szamla {
    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos,int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }
    public boolean kivesz (int osszeg){
        if (osszeg<hitelKeret){
            aktualisEgyenleg -=osszeg;
            return true;
        } else {
            return false;
        }
    }

}
