/*Write a Java program to create an abstract class Employee with abstract methods
calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that
extend the Employee class and implement the respective methods to calculate salary
and display information for each role.
 */
public abstract class EmployeeTest {
    private String name;
    private String id;

    public EmployeeTest(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    public static void main(String[] args) {
        EmployeeTest[] employees = {
            new Manager("Divyanshi", "2243110", 50000, 10000),
            new Programmer("Riddhima", "2243120", 50, 160)
        };

        for (EmployeeTest e : employees) {
            e.displayInfo();
        }
    }
}

class Manager extends EmployeeTest {
    private double baseSalary;
    private int bonus;

    public Manager(String name, String id, double baseSalary, int bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Programmer extends EmployeeTest {
    private double hourlyRate;
    private int hoursWorked;

    public Programmer(String name, String id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Salary: " + calculateSalary());
    }
}

