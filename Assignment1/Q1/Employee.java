import java.util.Scanner;

public class Employee {
   private String name;
   private int yearOfJoining;
   private double salary;
   private String address;

    private static int count = 0;
public Employee( String name,int yearOfJoining, double salary, String address){
    this.yearOfJoining = yearOfJoining;
    this.name = name;
    this.salary = salary;
    this.address = address;
    count++;
}

   public Employee() {
        this.name = "Yash Khanduja";
        this.yearOfJoining = 2025;
        this.salary = 1000000.00;
        this.address = "OOPs-Room,226A";
    }


//Setter
public Employee(Employee emp){
    this.yearOfJoining = emp.yearOfJoining;
    this.name = emp.name;
    this.salary = emp.salary;
    this.address = emp.address;
}
 // Getters/Setters 
    public String getName()          { return name; }
    public int    getYearOfJoining() { return yearOfJoining; }
    public double getSalary()        { return salary; }
    public String getAddress()       { return address; }

    public static int getCount(){
        return count;
    }

    @Override
   public String toString(){
    return name + '\t' + yearOfJoining + '\t' + address + '\t' + salary;
   }
}