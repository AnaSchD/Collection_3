import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Банан", 2.4, 46);
        Product product2 = new Product("Яблоки", 3.4, 356);
        Product product3 = new Product("Картошка", 1.7, 65);
        Product product4 = new Product("Апельсины", 1.8, 55);


        Product potato = new Product("картошка", 2.5, 55);
        Product pork = new Product("свинина", 1.5, 350);
        Product onion = new Product("лук", 0.3, 14);
        Product cabbage = new Product("капуста", 1.1, 55);
        Product carrot = new Product("морковь", 0.2, 19);
        Product carrot1 = new Product("морковь", 0.2, 19);


        Set<Product> recipe = new HashSet<>();
        recipe.add(pork);
        recipe.add(potato);
        recipe.add(onion);
        recipe.add(cabbage);
        recipe.add(carrot);

        Set<Product> recipe01 = new HashSet<>();
        recipe01.add(pork);
        recipe01.add(onion);
        recipe01.add(carrot1);

        Recipe recipe1 = new Recipe(recipe, "Shchi");
        Recipe recipe2 = new Recipe(recipe01, "Shchi8");
        // Recipe recipe2 = new Recipe(recipe01, "Shchi");

        RecipeCollection recipeCollection = new RecipeCollection();


        recipeCollection.addRecipeInRecipeCollection(recipe1);
        recipeCollection.addRecipeInRecipeCollection(recipe2);

//        System.out.println(recipeCollection);


        Passport passport1 = new Passport("Inna", "Ivanova", "Vasilyeva", "09.10.1996", 272);
        Passport passport2 = new Passport("Aleksey1", "Alekseev", "Alekseev", "05.12.1978", 67748372);
        Passport passport3 = new Passport("Aleksey2", "Alekseev", "Alekseev", "05.12.1978", 6783729);
        Passport passport4 = new Passport("Aleksey3", "Alekseev", "Alekseev", "05.12.1978", 678372);

        Passport.addPassportInCollection(passport1);
        Passport.addPassportInCollection(passport2);
        Passport.addPassportInCollection(passport3);
        Passport.addPassportInCollection(passport4);

//        System.out.println(Arrays.toString(Passport.passportList.toArray()));
//        System.out.println(Passport.searchPassport(67748372));
//
//
//        System.out.println(randomNumbers());



        PhoneDirectory.phoneDirectory.put("Иванов Иван", "8923447338");
        PhoneDirectory.phoneDirectory.put("Иванов Петя", "892344688338");
        PhoneDirectory.phoneDirectory.put("Иванов Слава", "89237488338");
        PhoneDirectory.phoneDirectory.put("Иванов Миша", "8923474338");
        PhoneDirectory.phoneDirectory.put("Сидоров Иван", "89233488338");
        PhoneDirectory.phoneDirectory.put("Петров Иван", "892348338");
        PhoneDirectory.phoneDirectory.put("Слива Иван", "89234434338");
        PhoneDirectory.phoneDirectory.put("Адексеев Иван", "8944334488338");
        PhoneDirectory.phoneDirectory.put("Алексеев Алексей", "8234488338");
        PhoneDirectory.phoneDirectory.put("Гришин Александр", "89237688338");
        PhoneDirectory.phoneDirectory.put("Семенов Миша", "892344883098");
        PhoneDirectory.phoneDirectory.put("Комисаров Евгений", "892345488338");
        PhoneDirectory.phoneDirectory.put("Силов Миша", "89234488548");
        PhoneDirectory.phoneDirectory.put("Петров Григорий", "8953488338");
        PhoneDirectory.phoneDirectory.put("Машкин Владимир", "89984488338");
        PhoneDirectory.phoneDirectory.put("Михайлов Максим", "89294488338");
        PhoneDirectory.phoneDirectory.put("Андреев Михаил", "89230488338");
        PhoneDirectory.phoneDirectory.put("Бездов Слава", "89234768338");
        PhoneDirectory.phoneDirectory.put("Левый Иван", "89234483438");
        PhoneDirectory.phoneDirectory.put("Милкин Иван", "89234488438");
        PhoneDirectory.phoneDirectory.put("Слезов Саша", "892344881338");
        PhoneDirectory.phoneDirectory.put("Силков Андрей", "89234578338");

        System.out.println(PhoneDirectory.phoneDirectory);

    }

    //дз 2 зад 2

    public static Set<Integer> randomNumbers() {
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            double random = Math.random() * 1000;
            integers.add((int)random);
        }
        System.out.println(integers);
        for (Integer count : integers) {               //?????????????????????????????? я сделала по изученным темам
            if (count % 2 != 0) {
                integers.remove(count);
            }
        }
        return integers;
    }

    // дз 3 зад 4
    // HashSet, потому что изначально идет сравнение по хеш-коду
    //





}