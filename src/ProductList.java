import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private Set<Product> list = new HashSet<>();
    private Set<Reception> list1 = new HashSet<>();

    public void setList(Set<Product> list) {
        this.list = list;
    }

    public Set<Product> getList() {
        return list;
    }

    public void addReception(Reception reception) {
        if (reception.getRecipe().isBlank() || reception.getTotalCost() == 0) {
            throw new RuntimeException("Рецепт не указан");
        }if(list1.contains(reception)) {
            throw new RuntimeException("рецепт уже есть в списке");
        }

        list1.add(reception);

    }


    public void addList(Product product) {
        if (product.getProduct().isBlank() || product.getPrice() == 0 || product.getWeight() == 0) {
            throw new RuntimeException("Поле должно быть заполнено");
        }if(list.contains(product)) {
            throw new RuntimeException("Продукт уже есть в списке");
        }
        list.add(product);

    }

    public void isBought(Product product) {
        if (list.contains(product)) {
            product.setBought(true);
        } else {
            throw new RuntimeException("Продукт еще не добавлен в список");
        }


    }


}
