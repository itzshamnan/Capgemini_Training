import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Employee {

    public Integer id;
    public String name;
    public Double salary;
    public String department;
    public Employee(Integer id, String name, Double salary, String department) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }


    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Double getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {

        return "Employee [id =" + this.id + ", name = " +this.name +", salary= "+ this.salary +", department= "+ this.department+"]";
    }
    public static void options(){
        System.out.println("a) ID");
        System.out.println("b) Name");
        System.out.println("a) Salary");
        System.out.println("a) Department");
        System.out.println("Enter your choice");
        Scanner scan=new Scanner(System.in);
        char opt=scan.next().charAt(0);


        }


    }


public class Q3_Employee_TreeSet {
    public static void main(String[] args) {


        TreeSet<Employee> obj=new TreeSet<>(new FirstComparator());
        obj.add(new Employee(1,"ABCD",41000.0,"A4"));
        obj.add(new Employee(2,"XYZ",22000.0,"AA2"));
        obj.add(new Employee(3,"EFGH",63000.0,"C8"));
        obj.add(new Employee(4,"PQRST",56666.0,"CC8"));
        obj.add(new Employee(5,"UVW",200000.0,"NM4"));
        obj.add(new Employee(6,"HIJK",77000.0,"T9"));
        obj.add(new Employee(7,"LMNO",8222.0,"A5"));
        Employee.options();
        for(Employee e :obj) {
            System.out.println(e);
        }






    }
}
class FirstComparator implements Comparator<Employee> {
    @Override public int compare(Employee e1, Employee e2)
    {
        return (e1.id).compareTo(e2.id);


    }
}
