package CS2;
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John Doe");
        person1.setAge(26);
        person1.setEmail("john.doe@gmail.com");

        Person person2 = new Person();
        person2.setName("Jane Doe");
        person2.setAge(35);
        person2.setEmail("jane.doe@gmail.com");

        person1.displayInfo();
        person2.displayInfo();
    }
}
