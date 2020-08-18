package CollectionHomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List2 {

    public static void wordsList() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0, 1);
        numbers.add(8);
        numbers.add(0, 6);
        numbers.add(3);
        numbers.add(0, 2);
        numbers.add(7);
        numbers.add(0, 4);
        numbers.add(5);
        numbers.add(0, 0);
        numbers.add(9);
        int index = numbers.size() - 1;
        int halfSize = numbers.size() / 2;

        for (int i = 0; i < halfSize; i++) {
            System.out.println(numbers.get(i));
            System.out.println(numbers.get(index));
            index--;
        }

        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            int tern = 0;
            Random rand = new Random();
            int randomElement = numbers.get(rand.nextInt(numbers.size()));
            if (randomElement != 0 && randomElement != numbers.size() - 1) {
                tern = numbers.get(randomElement);
                numbers.remove(randomElement);
                numbers.add(tern);
                System.out.println("_______________________");
                System.out.println(numbers);
                break;
            } else {
                System.out.println("First or last item selected");
            }
        }
    }
}




