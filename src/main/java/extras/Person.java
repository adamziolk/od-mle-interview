package extras;

public class Person {
    public static String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayMyName() {
        System.out.println(name);
    }
}
