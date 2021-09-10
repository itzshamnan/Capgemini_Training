import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class employee{
    int id;
    String name;
    int salary;
    String Department;

    public employee(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        Department = department;
    }
}

class NameComparator implements Comparator<employee>
{

    public int compare(employee e1, employee e2)
    {
        return e1.name.compareTo(e2.name);
    }
}
class SalaryComparator implements Comparator<employee>
{

    public int compare(employee e1, employee e2)
    {
        return e1.salary-e2.salary;
    }
}
class DeptComparator implements Comparator<employee>
{

    public int compare(employee e1, employee e2)
    {
        return e1.Department.compareTo(e2.Department);
    }
}
class IdComparator implements Comparator<employee>
{

    public int compare(employee e1, employee e2)
    {
        return e1.id-e2.id;
    }
}
public class Q3_Employee_TreeSet {

    public static void main(String[] args) {

        int ch;
        Scanner in = new Scanner(System.in);
        char f = 'y';
        while (f=='y'){

            System.out.println("1) ID");
            System.out.println("2) Name");
            System.out.println("3) Salary");
            System.out.println("4) Department");
            System.out.println("Enter your choice");


            ch = in.nextInt();
            switch (ch){
                case 2:
                    TreeSet<employee>employeeTreeSet = new TreeSet<>(new NameComparator());
                    AddToTree(employeeTreeSet);
                    DisplayTree(employeeTreeSet);
                    break;
                case 3:
                    TreeSet<employee>employeeTreeSet1 = new TreeSet<>(new SalaryComparator());
                    AddToTree(employeeTreeSet1);
                    DisplayTree(employeeTreeSet1);
                    break;
                case 4:
                    TreeSet<employee>employeeTreeSet2 = new TreeSet<>(new DeptComparator());
                    AddToTree(employeeTreeSet2);
                    DisplayTree(employeeTreeSet2);
                    break;
                case 1:
                    TreeSet<employee>employeeTreeSet3 = new TreeSet<>(new IdComparator());
                    AddToTree(employeeTreeSet3);
                    DisplayTree(employeeTreeSet3);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;

            }
            System.out.println("\ndo you want to continue? y/n");
            f=in.next().charAt(0);
        }
    }

    private static void DisplayTree(TreeSet<employee> employeeTreeSet) {

        for (employee ob:employeeTreeSet)
        {
            System.out.print(ob.id+" "+ob.name+" "+ ob.salary+" "+ob.Department+"\n");
        }
    }

    private static void AddToTree(TreeSet<employee> employeeTreeSet) {
        employeeTreeSet.add(new employee(1,"ABCD",41000,"A4"));
        employeeTreeSet.add(new employee(2,"XYZ",22000,"AA2"));
        employeeTreeSet.add(new employee(3,"EFGH",63000,"C8"));
        employeeTreeSet.add(new employee(4,"PQRST",56666,"CC8"));
        employeeTreeSet.add(new employee(5,"UVW",200000,"NM4"));
        employeeTreeSet.add(new employee(6,"HIJK",77000,"T9"));
        employeeTreeSet.add(new employee(7,"LMNO",8222,"A5"));
    }

}