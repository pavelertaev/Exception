import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private HashMap<Product,Integer> products = new HashMap<>();
    private final Set<Reception> receptionSet = new HashSet<>();

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public void addReception(Reception reception) {
        if (reception.getRecipe().isBlank() ) {
            throw new RuntimeException("Рецепт не указан");
        }if(receptionSet.contains(reception)) {
            throw new RuntimeException("рецепт уже есть в списке");
        }

        receptionSet.add(reception);

    }


    public void addProduct(Product product) {
        if(product.equals(null)&&product.getAmount()==0){
            throw new RuntimeException("Продукт не может быть пустым");
        }
        if (product.getProduct().isBlank() || product.getPrice() == 0 || product.getWeight() == 0) {
            throw new RuntimeException("Поле должно быть заполнено");
        }if(products.containsKey(product)) {
            throw new RuntimeException("Продукт уже есть в списке");
        }
        products.put(product, product.getAmount());

    }

    public void isBought(Product product) {
        if (products.containsKey(product)) {
            product.setBought(true);
        } else {
            throw new RuntimeException("Продукт еще не добавлен в список");
        }


    }


}
