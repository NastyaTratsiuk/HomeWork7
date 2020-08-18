package SortParagraph5;

public class Student implements Comparable<Student> {

    private String name;
    private int acssesful;
    private int age;

    public Student(String mane, int acssesful, int age) {
        this.name = getName();
        this.acssesful = getAcssesful();
        this.age = getAge();
    }

    public int compareTo(Student o) {
        return name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcssesful() {
        return acssesful;
    }

    public void setAcssesful(int acssesful) {
        this.acssesful = acssesful;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}