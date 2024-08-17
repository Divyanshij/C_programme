//LAB 4
import java.util.*;

class Employee {
    String name = "";
    int empId = 0;
    String phoneNo = null;
    int salary = 0;
    Scanner sc = new Scanner(System.in);

    void empDetail() {
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Emp ID:");
        empId = sc.nextInt();
        System.out.println("Enter Phone No:");
        phoneNo = sc.next();
        salaryFetch();
    }

    void salaryFetch() {
        System.out.println("Enter Salary: ");
        salary = sc.nextInt();
    }
}

public class EmpMethod {
    public static void main(String arg[]) {
        Employee obj = new Employee();
        obj.empDetail();
        System.out.println("Employee Id: " + obj.empId);
        System.out.println("Employee Name: " + obj.name);
        System.out.println("Employee Phone Number: " + obj.phoneNo);
        System.out.println("Employee salary before increment: " + obj.salary);
        obj.salary += 1000;
        System.out.println("Employee salary after increment:" + obj.salary);
    }
}