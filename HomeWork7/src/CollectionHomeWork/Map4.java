package CollectionHomeWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map4 {

    public static void creatingNewUser() {
        Map<String, String> users = new LinkedHashMap<>();
        users.put("Den", "Denis");
        users.put("I1980", "Ivan");
        users.put("Agent", "Petr");
        users.put("Kristi", "Kristina");
        users.put("N.M", "Nastya");
        System.out.println(users);

        String newKey = "Queen";
        if (users.containsKey(newKey)) {
            System.out.println("Such a user exists!");
        } else {
            users.put("Queen", "Vlad");
        }
        System.out.println(users);
    }
}

