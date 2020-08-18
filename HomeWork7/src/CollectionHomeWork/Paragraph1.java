package CollectionHomeWork;

import java.util.*;

public class Paragraph1 {

    public static void polyclic() {
        int size = 3;
        int number = 0;

        Deque<String> dequePolyclic = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            dequePolyclic.offer("Ivan");
            dequePolyclic.offer("Petr");
            dequePolyclic.offer("Kate");
            dequePolyclic.offer("Nastya");
        }

        System.out.println(dequePolyclic);

        int sizeDeque = dequePolyclic.size();
        for (int i = 0; i < sizeDeque; i++) {
            if (number == 2) {
                number = 0;
                System.out.println(dequePolyclic.pollLast());
            } else {
                dequePolyclic.poll();
                number++;
            }
        }
        System.out.println(dequePolyclic);
    }

    public static void knockoutRace() {
        Deque<Integer> race = new LinkedList();
        race.offer(1);
        race.offer(2);
        race.offer(3);
        race.offer(4);
        race.offer(5);
        race.offer(6);

        List<Integer> raceList = new ArrayList<>(race);
        Collections.shuffle(raceList);

        for (int i = race.size() - 1; i > 0; i--) {
            System.out.println(raceList.remove(i));
            if (i == 0) {
                break;
            }
        }
        System.out.println(raceList);
    }
}




