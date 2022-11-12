import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product banan = new Product("Банан", 50, 1);
        Product apple = new Product("Яблоки", 60, 1);
        Product fish = new Product("Рыба", 250, 2);
        Product meat = new Product("Мясо", 450, 3);

        ProductList product = new ProductList();
        ProductList recipe = new ProductList();
        product.addList(banan);
        product.addList(apple);
        product.addList(fish);
        product.addList(meat);


        Reception breakFast= new Reception(new HashSet<>(),"Завтрак");

        breakFast.addProducts(banan);
        breakFast.addProducts(apple);
        recipe.addReception(breakFast);
        System.out.println(product.getList());
        System.out.println(breakFast.getTotalCost());


        Set<Integer> nums= new HashSet<>();
        int i = 0;
        while (i < 20) {
            int value = (int) (Math.random() * 1000);
            if (!nums.contains(value)) {
                i++;
            }
            nums.add(value);
        }
        System.out.println(nums);


        nums.removeIf(num -> num % 2 == 1);
        System.out.println(nums);

    }
}