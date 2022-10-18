public class Produkt {
    double Basispreis;
    int Tage;

    public Produkt(double basispreis, int tage) {
        Basispreis = basispreis;
        Tage = tage;
    }
    public void round(){
        double preis = 0.00;
        while(preis < this.Basispreis){
            preis += 0.05;
        }
        this.Basispreis = preis;
    }
    public void mitRabatt(){
        if(this.Tage > 10)
            this.Basispreis = this.Basispreis - this.Basispreis/10;
        else if(this.Tage > 20)
            this.Basispreis= this.Basispreis - this.Basispreis/20;
    }

    @Override
    public String toString() {
        return "Produkt(" +
                "Basispreis:" + String.format("%.2f",Basispreis) +
                ", Tage:" + Tage +
                ')';
    }

    public double getBasispreis() {
        return Basispreis;
    }

    public int getTage() {
        return Tage;
    }

    public void setBasispreis(double basispreis) {
        Basispreis = basispreis;
    }

    public void setTage(int tage) {
        Tage = tage;
    }
}
