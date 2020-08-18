package SortParagraph5;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting5 {

    public static void studentsList() {
        ArrayList<String> students = new ArrayList<>();

        students.add("Ivan");
        students.add("Petr");
        students.add("Nastya");
        students.add("Dima");
        students.add("Kate");

        Collections.sort(students);
        System.out.println(students);
    }
}