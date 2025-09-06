public class Person {
    private String localName;
    private int localAge;
    private String localEmail;

    public String getName() {
        return localName;
    }

    public void setName(String name) {
        localName = name;
    }

    public int getAge() {
        return localAge;
    }

    public void setAge(int age) {
        localAge = age;
    }

    public String getEmail() {
        return localEmail;
    }

    public void setEmail(String email) {
        localEmail = email;
    }

    public void displayInfo() {
        System.out.println("Person Information:");
        System.out.println("Name : " + localName);
        System.out.println("Age  : " + localAge);
        System.out.println("Email: " + localEmail);
        System.out.println();
    }
}
