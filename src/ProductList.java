import java.util.HashSet;
import java.util.Set;

public class ProductList  {
    private Set<Product> list= new HashSet<>();

    public void setList(Set<Product> list) {
        this.list = list;
    }

    public Set<Product> getList() {
        return list;
    }
    public void addList(Product product){
        if(product.getProduct().isBlank()||product.getPrice()==0||product.getWeight()==0){
            throw new RuntimeException("Поле должно быть заполнено");
        }
        list.add(product );

    }
    public void isBought(Product product){
        if(list.contains(product)){
            product.setBought(true);
        }else{
            throw new RuntimeException("Продукт еще не добавлен в список");
        }


    }
}
