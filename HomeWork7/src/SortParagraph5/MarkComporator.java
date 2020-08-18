package SortParagraph5;

public class MarkComporator extends Student {

    public MarkComporator(String mane, int acssesful, int age) {
        super(mane, acssesful, age);
    }

    public int compareAcssesful(Student a, Student b) {
        if (a.getAcssesful() > b.getAcssesful()) {
            return 1;
        } else if (a.getAcssesful() < b.getAcssesful()) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compareAge(Student a, Student b) {
        if (a.getAge() > b.getAge()) {
            return 1;
        } else if (a.getAge() < b.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
