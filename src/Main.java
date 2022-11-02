import java.util.*;

public class Main {

    public static Map<String, Integer> map = new LinkedHashMap<>();
    static Map<String, List<Integer>> map1 = new HashMap<>();


    public static void main(String[] args) {



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

        //System.out.println(PhoneDirectory.phoneDirectory);

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 4);
        map.put("a", 5);
        System.out.println(map);


        map1.put("a", addRand());
        map1.put("b", addRand());
        map1.put("c", addRand());
        map1.put("d", addRand());
        map1.put("e", addRand());

        System.out.println(map1);
        method(map1);


        //дз 2 зад 2

        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        map.put("j", 7);
        map.put("k", 8);
        map.put("l", 9);
        map.put("m", 10);
        System.out.println(map);

    }

// дз 1 зад 3
    public static void addMap(String key, Integer value) {

        if (map.containsKey(key) && map.get(key).equals(value)) {
            throw new RuntimeException("Данные совпадают");
        }
        map.put(key, value);
    }

//дз 2 зад 1

    public static List addRand(){

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int one = random.nextInt(1000);
        int two = random.nextInt(1000);
        int three = random.nextInt(1000);
        list.add(one);
        list.add(two);
        list.add(three);
        return list;
    }
    public static void method(Map map){
        for (var keySet: map1.keySet()) {
            Integer sum = 0;
            List <Integer>list = map1.get(keySet);
            for (Integer integerSum : list) {
                sum += integerSum;
            }
            map.put(keySet, sum);
        }
        System.out.println(map);
    }


}


