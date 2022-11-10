import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Reception {
    private Set<Product> products = new HashSet<>();
    private int totalCost;
    private String recipe;


    public Reception(Set<Product> products, String recipe) {
        this.products = products;
        this.recipe = recipe;
        calculateCost();
    }
    public void addProducts(Product product){
        products.add(product);
    }

    public Set<Product> getProducts() {
        return products;
    }

    public int getTotalCost() {
        calculateCost();
        return totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reception reception = (Reception) o;
        return totalCost == reception.totalCost && Objects.equals(products, reception.products) && Objects.equals(recipe, reception.recipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCost, recipe);
    }

    public String getRecipe() {
        return recipe;
    }

    public void calculateCost() {
        int total = 0;
        for (Product list : products) {
            total += list.getPrice();
        }
        totalCost = total;
    }

}

