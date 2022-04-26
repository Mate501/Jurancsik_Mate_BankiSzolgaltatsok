package hu.bankproject;

public class Szamla extends BankiSzolgatatas {
    protected int aktualisEgyenleg;
    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg){
        aktualisEgyenleg+=osszeg;
    }
    public boolean kivesz(int osszeg){
        boolean eleg;
        if (osszeg > aktualisEgyenleg) eleg = false;
        else {
            eleg = true;
            aktualisEgyenleg -=osszeg;
        }
        return eleg;
    }
    public Kartya ujKartya(String kartyaszam){
        return new Kartya(this.getTulajdonos(), this, kartyaszam);
    }

}
