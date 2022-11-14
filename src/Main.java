import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product banan = new Product("Банан", 50, 1);
        Product apple = new Product("Яблоки", 60, 1);
        Product fish = new Product("Рыба", 250, 2);
        Product meat = new Product("Мясо", 450, 3);

        HashMap<Product,Integer> products = new HashMap<>();
        ProductList recipe = new ProductList();
        products.put(banan,3);
        products.put(apple,2);
        products.put(fish,2);
        products.put(meat,3);


        Reception breakFast= new Reception(new HashMap<Product,Integer>(),"Завтрак");

        breakFast.addProducts(banan);
        breakFast.addProducts(apple);
        recipe.addReception(breakFast);
        System.out.println(products.keySet());
        System.out.println(breakFast.getTotalCost());


//        Set<Integer> nums= new HashSet<>();
//        int i = 0;
//        while (i < 20) {
//            int value = (int) (Math.random() * 1000);
//            if (!nums.contains(value)) {
//                i++;
//            }
//            nums.add(value);
//        }
//        System.out.println(nums);
//
//
//        nums.removeIf(num -> num % 2 == 1);
//        System.out.println(nums);
        System.out.println("Задание телефонная книга");

        PhoneBook artem = new PhoneBook("Артем","а");
        PhoneBook pavel = new PhoneBook("Павел","в");
        PhoneBook sergei = new PhoneBook("Сергей","в");
        PhoneBook maria = new PhoneBook("Мария","к");
        PhoneBook andrey = new PhoneBook("Андрей","ы");
        PhoneBook anton = new PhoneBook("Антон","о");
        PhoneBook ivan = new PhoneBook("Иван","а");
        PhoneBook tom = new PhoneBook("Том","й");
        PhoneBook bob = new PhoneBook("Боб","н");
        PhoneBook igor = new PhoneBook("Игорь","о");
        PhoneBook inna = new PhoneBook("Инна","г");
        PhoneBook feel = new PhoneBook("Фил","и");
        PhoneBook ignat = new PhoneBook("Игнат","ш");
        PhoneBook alex = new PhoneBook("Алекс","ч");
        PhoneBook lex = new PhoneBook("Лекс","щ");
        PhoneBook vin = new PhoneBook("Вин","ь");
        PhoneBook anna = new PhoneBook("Анна","л");
        PhoneBook aleksei = new PhoneBook("Алексей","в");
        PhoneBook mixail = new PhoneBook("Михаил","ь");
        PhoneBook danil = new PhoneBook("Данил","ш");
        PhoneBook lena = new PhoneBook("Лена","щ");

         HashMap<PhoneBook,String> phoneBook = new HashMap<>();
         phoneBook.put(artem,"89156664557");
         phoneBook.put(pavel,"89156664556");
         phoneBook.put(sergei,"89156664553");
         phoneBook.put(maria,"89156664542");
         phoneBook.put(andrey,"89156664555");
         phoneBook.put(anton,"89156664588");
         phoneBook.put(ignat,"89156664544");
         phoneBook.put(ivan,"89156664577");
         phoneBook.put(tom,"89156664512");
         phoneBook.put(bob,"89156664546");
         phoneBook.put(igor,"89156664599");
         phoneBook.put(inna,"89156664575");
         phoneBook.put(feel,"89156664558");
         phoneBook.put(alex,"89156664585");
         phoneBook.put(lex,"89156664521");
         phoneBook.put(vin,"89156664532");
         phoneBook.put(anna,"89156664533");
         phoneBook.put(aleksei,"89156664544");
         phoneBook.put(mixail,"89156664566");
         phoneBook.put(danil,"89156664544");
         phoneBook.put(lena,"89156664577");
        System.out.println(phoneBook.keySet());
        System.out.println(phoneBook.values());
        System.out.println(phoneBook.get(artem));





    }

}