import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    private static int compare(Person o1, Person o2) {
        return Integer.compare(o1.height, o2.height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) == 0){
            if (o.age > this.age) return 1;
            else if (o.age == this.age) return 0;
            else return -1;
        }
        return this.name.compareTo(o.name);
    }
    public static void main(String[] args) {
        ArrayList<Person> pupils = new ArrayList<>();
        pupils.add(new Person("Макс", 12, 13, 183));
        pupils.add(new Person("Анна", 33, 13, 83));
        pupils.add(new Person("Настя", 29, 67, 5));
        pupils.add(new Person("Макс", 1, 72, 52));
        pupils.add(new Person("Леша", 22, 13, 383));
        pupils.add(new Person("Леша", 42, 113, 183));
        pupils.add(new Person("Дима", 55, 19, 777));
        Collections.sort(pupils);
        for (Person pupil : pupils) {
            System.out.println(pupil);
        }
    }
}