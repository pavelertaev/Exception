import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Product> products = new HashSet<>();
    private Set<Reception> receptionSet = new HashSet<>();

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void addReception(Reception reception) {
        if (reception.getRecipe().isBlank() || reception.getTotalCost() == 0) {
            throw new RuntimeException("Рецепт не указан");
        }if(receptionSet.contains(reception)) {
            throw new RuntimeException("рецепт уже есть в списке");
        }

        receptionSet.add(reception);

    }


    public void addProduct(Product product) {
        if(product.equals(null)){
            throw new RuntimeException("Продукт не может быть пустым");
        }
        if (product.getProduct().isBlank() || product.getPrice() == 0 || product.getWeight() == 0) {
            throw new RuntimeException("Поле должно быть заполнено");
        }if(products.contains(product)) {
            throw new RuntimeException("Продукт уже есть в списке");
        }
        products.add(product);

    }

    public void isBought(Product product) {
        if (products.contains(product)) {
            product.setBought(true);
        } else {
            throw new RuntimeException("Продукт еще не добавлен в список");
        }


    }


}
