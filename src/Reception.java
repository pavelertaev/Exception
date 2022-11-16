import java.util.HashMap;
import java.util.Objects;

public class Reception {
    private HashMap<Product,Integer> products = new HashMap<>();
    private int totalCost;
    private String recipe;


    public Reception(HashMap<Product, Integer> products, String recipe) {
        this.products = products;
        this.recipe = recipe;
        this.totalCost = getTotalCost();
    }

    public void addProducts(Product product,int amount){
        if(amount <1){
            amount=Math.abs(amount);
        }
        products.put(product,amount);

    }
    public void addProducts(Product product){
        products.put(product,1);
    }

    public void setProducts(HashMap<Product, Integer> products) {
        this.products = products;
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
        for (Product product : products.keySet() ) {
            int i =( product.getWeight() * product.getPrice())* products.get(product);
            total += i;
        }
        totalCost = total;
    }

}

