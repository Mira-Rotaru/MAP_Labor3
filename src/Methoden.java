import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Methoden {
    //Ubung 1
    public double TotalPreise(List<Produkt> liste){
        double summe=0;
        for(Produkt p:liste){
            p.mitRabatt();
            p.round();
            summe += p.getBasispreis();
        }
        return summe;
    }
    //Ubung 2
    public List<Produkt> HoherAls100(List<Produkt> liste){
        List<Produkt> neue_liste = new ArrayList<Produkt>();
        for(Produkt p:liste){
            p.mitRabatt();
            p.round();
            if(p.getBasispreis() > 100)
                neue_liste.add(p);
        }
        return neue_liste;
    }
    //Ubung 3
    public List<Produkt> SortiertnachRabatt(List<Produkt> liste){
        List<Produkt> nachRabatt = new ArrayList<Produkt>();
        for(Produkt p:liste){
            p.mitRabatt();
            p.round();
            nachRabatt.add(p);
        }
        nachRabatt.sort((p1,p2) -> (int)(p1.getBasispreis() - p2.getBasispreis()));
        return nachRabatt;
    }
    //Ubung 4 - teuerste Produkt
    public Produkt TeuersteProdukt(List<Produkt> liste){
        List<Produkt> nachRabatt = new ArrayList<Produkt>();
        for(Produkt p:liste){
            p.mitRabatt();
            p.round();
            nachRabatt.add(p);
        }
        Produkt maxPreis = nachRabatt
                .stream()//gets a stream of values from the list
                .max(Comparator.comparing(Produkt::getBasispreis))//calling max function on the stream, while passing a lambda function as comparator
                .orElseThrow(NoSuchElementException::new); //exception, in case the list is empty
        return maxPreis;
    }
    //Ubung 4 - gunstigste Produkt
    public Produkt GunstigsteProdukt(List<Produkt> liste){
        List<Produkt> nachRabatt = new ArrayList<Produkt>();
        for(Produkt p:liste){
            p.mitRabatt();
            p.round();
            nachRabatt.add(p);
        }
        Produkt minPreis = nachRabatt
                .stream()//gets a stream of values from the list
                .min(Comparator.comparing(Produkt::getBasispreis))//calling max function on the stream, while passing a lambda function as comparator
                .orElseThrow(NoSuchElementException::new); //exception, in case the list is empty
        return minPreis;
    }
}
