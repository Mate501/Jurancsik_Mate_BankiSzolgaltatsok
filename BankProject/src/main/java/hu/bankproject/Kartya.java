package hu.bankproject;

public class Kartya extends BankiSzolgatatas {
    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos,Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }
    public boolean vasarlas(int osszeg){
        if (this.szamla.getAktualisEgyenleg() > osszeg){
            this.szamla.aktualisEgyenleg -= osszeg;
            return true;
        } else {
            return false;
        }
    }
}
