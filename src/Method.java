import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Method {
    //Ex1
    public double TotalPrices(List<Product> list){
        double sum=0;
        for(Product p:list){
            p.afterDiscount();
            p.round();
            sum += p.getPrice();
        }
        return sum;
    }
    //Ex2
    public List<Product> moreThan100(List<Product> list){
        List<Product> newList = new ArrayList<>();
        for(Product p:list){
            p.afterDiscount();
            p.round();
            if(p.getPrice() > 100)
                newList.add(p);
        }
        return newList;
    }
    //Ex3
    public List<Product> sortAfterDiscount(List<Product> list){
        List<Product> appliedDiscount = new ArrayList<>();
        for(Product p:list){
            p.afterDiscount();
            p.round();
            appliedDiscount.add(p);
        }
        appliedDiscount.sort((p1,p2) -> (int)(p1.getPrice() - p2.getPrice()));
        return appliedDiscount;
    }
    //Ex4 - most expensive item
    public Product mostExpensive(List<Product> list){
        List<Product> appliedDiscount = new ArrayList<>();
        for(Product p:list){
            p.afterDiscount();
            p.round();
            appliedDiscount.add(p);
        }
        return appliedDiscount
                .stream()//gets a stream of values from the list
                .max(Comparator.comparing(Product::getPrice))//calling max function on the stream, while passing a lambda function as comparator
                .orElseThrow(NoSuchElementException::new); //exception, in case the list is empty
    }
    //Ex4 - least expensive item
    public Product leastExpensive(List<Product> list){
        List<Product> appliedDiscount = new ArrayList<>();
        for(Product p:list){
            p.afterDiscount();
            p.round();
            appliedDiscount.add(p);
        }
        return appliedDiscount
                .stream()//gets a stream of values from the list
                .min(Comparator.comparing(Product::getPrice))//calling max function on the stream, while passing a lambda function as comparator
                .orElseThrow(NoSuchElementException::new); //exception, in case the list is empty
    }
}
