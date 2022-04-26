package hu.bankproject;

public class BankiSzolgaltatasok {
    private Tulajdonos tulajdonos;

    public BankiSzolgaltatasok(Tulajdonos tulajdonos){
        this.tulajdonos = tulajdonos;
    }
    public Tulajdonos getTulajdonos(){
        return tulajdonos;
    }
}

