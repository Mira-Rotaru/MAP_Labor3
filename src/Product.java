public class Product {
    double price;
    int days;

    public Product(double price, int days) {
        this.price = price;
        this.days = days;
    }
    public void round(){
        double price = 0.00;
        while(price < this.price){
            price += 0.05;
        }
        this.price = price;
    }
    public void afterDiscount(){
        if(this.days > 10)
            this.price = this.price - this.price /10;
        if(this.days > 20)
            this.price = this.price - this.price /20;
    }

    @Override
    public String toString() {
        return "Product(" +
                "Price:" + String.format("%.2f", price) +
                ", Days:" + days +
                ')';
    }

    public double getPrice() {
        return price;
    }

    public int getDays() {
        return days;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
