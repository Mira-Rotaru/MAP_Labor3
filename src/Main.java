import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        Product p1 = new Product(15.00,8);
        Product p2 = new Product(20.00,5);
        Product p3 = new Product(130.00,15);
        Product p4 = new Product(100.00,18);
        Product p5 = new Product(30.00,24);
        Product p6 = new Product(180.00,39);
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);
        products.add(p6);
        Method m = new Method();

        System.out.printf("Ex1\nTotal price of products is %.2f\n", m.TotalPrices(products));

        System.out.println("Ex2\nProducts with price greater than 100:");
        System.out.println(m.moreThan100(products).toString());

        System.out.println("Ex3\nProducts sorted in ascending order by price:");
        System.out.println(m.sortAfterDiscount(products).toString());

        System.out.println("Ex4\nMost expensive product:");
        Product t = m.mostExpensive(products);
        System.out.printf("(Price:%.2f, Days:%d)", t.getPrice(), t.getDays());
        System.out.println("Ex4\nLeast expensive product:");
        Product g = m.leastExpensive(products);
        System.out.printf("(Price:%.2f, Days:%d)", g.getPrice(), g.getDays());

    }
}