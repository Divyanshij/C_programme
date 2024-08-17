public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Divyanshi Jangid", 19);

        person1.displayInfo();

        person1.setAge(20);
        person1.displayInfo();
    }
}
