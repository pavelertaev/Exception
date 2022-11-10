import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product banan = new Product("Банан", 50, 1);
        Product apple = new Product("Яблоки", 60, 1);
        Product fish = new Product("Рыба", 250, 2);
        Product meat = new Product("Мясо", 450, 3);
        ProductList product = new ProductList();
        product.addList(banan);
        product.addList(apple);
        product.addList(fish);
        product.addList(meat);
        System.out.println(product.getList());
        //product.isBought(meat);


    }
}