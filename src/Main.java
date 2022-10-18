import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Produkt p1 = new Produkt(15.00,8);
        Produkt p2 = new Produkt(20.00,5);
        Produkt p3 = new Produkt(130.00,15);
        Produkt p4 = new Produkt(100.00,18);
        Produkt p5 = new Produkt(30.00,24);
        Produkt p6 = new Produkt(180.00,39);
        List<Produkt> produkte = new ArrayList<Produkt>();
        produkte.add(p1);
        produkte.add(p2);
        produkte.add(p3);
        produkte.add(p4);
        produkte.add(p5);
        produkte.add(p6);
        Methoden m = new Methoden();

        System.out.printf("UBUNG1\nTotal Preis der Produkte ist %.2f\n", m.TotalPreise(produkte));

        System.out.println("UBUNG2\nProdukte mit Preis hoher als 100:");
        System.out.println(m.HoherAls100(produkte).toString());

        System.out.println("UBUNG3\nProdukte sortiert nach Rabattpreis:");
        System.out.println(m.SortiertnachRabatt(produkte).toString());

        System.out.println("UBUNG 4\nTeuerste Produkt:");
        Produkt t = m.TeuersteProdukt(produkte);
        System.out.printf("(Preis:%.2f, Tage:%d)", t.getBasispreis(), t.getTage());
        System.out.println("UBUNG 4\nGunstigste Produkt:");
        Produkt g = m.GunstigsteProdukt(produkte);
        System.out.printf("(Preis:%.2f, Tage:%d)", g.getBasispreis(), g.getTage());

    }
}