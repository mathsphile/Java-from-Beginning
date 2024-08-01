public class Person {
    String name;
    int age;
    String address;

    // Constructor to initialize all attributes
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Constructor to initialize name and age, set address to "Unknown"
    public Person(String name, int age) {
        this(name, age, "Unknown"); // Constructor chaining
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Creating Person object with all attributes
        Person person1 = new Person("Alice", 30, "123 Main St");
        person1.display();

        System.out.println();

        // Creating Person object with name and age, address set to "Unknown"
        Person person2 = new Person("Bob", 25);
        person2.display();
    }
}
