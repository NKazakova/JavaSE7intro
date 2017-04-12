/**
 * Created by user on 11.04.2017.
 */
public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;

    }

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.age = 10;

        Person person2 = new Person();
        person2.age = 33;

        System.out.println(person1.getAge());
        System.out.println(person2.getAge());


    }
}
