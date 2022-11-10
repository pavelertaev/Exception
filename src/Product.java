import java.util.*;

public class Product {
    private String product;
    private int price;
    private int weight;

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    private boolean bought=false;


    public boolean isBought() {
        return bought;
    }

    public Product(String product, int price, int weight) {
        this.product = product;
        this.price = price;
        this.weight = weight;

    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return price == product1.price && weight == product1.weight && Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, price, weight);
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
