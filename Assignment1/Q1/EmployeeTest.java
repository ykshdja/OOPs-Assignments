import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class EmployeeTest {
    public static void main(String[] args) {
            Employee e1 = new Employee("Ram", 1994, 50000, "64C Vasant Kunj 110070");
        Employee e2 = new Employee("Sam", 2000, 55000, "68D Dwarka 110037");
        Employee e3 = new Employee("Ana", 1999, 52000, "26B R.K Puram 110022");
        
        List<Employee> list = new ArrayList<>();
        Collections.addAll(list, e1, e2, e3);
        
        System.out.println("How many No. of Employees for which information is required: ");
        Scanner sc = new Scanner(System.in);
        int numEmployee = Employee.getCount();
        int n = sc.nextInt();
        Employee[] staff = new Employee[n];
        if(n>numEmployee){
            for (int i = 0; i < n - numEmployee; i++) {
             System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Year of joining: ");
            int year = Integer.parseInt(sc.nextLine());

            System.out.print("Salary: ");
            double salary = Double.parseDouble(sc.nextLine());

            System.out.print("Address: ");
            String address = sc.nextLine();

            list.add(new Employee(name, year, salary, address));
            }
            
        }
       
        System.out.println("\n Current Employees:");
        for (Employee e : list) {
            System.out.println(e);  //uses toString()
                }
       

    }
}