package hu.bankproject;

public class BankiSzolgatatas {
    private Tulajdonos tulajdonos;

    protected BankiSzolgatatas(Tulajdonos tulajdonos){
        this.tulajdonos = tulajdonos;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }

}
