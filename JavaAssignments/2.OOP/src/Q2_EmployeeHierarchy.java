class Employee{
    int Empid;
    String name;
    private double salary;

    public double getSalary()
    {
        return salary;
    }
    public Employee(int empid,String name,double salary)
    {
        this.Empid=empid;
        this.name=name;
        this.salary=salary;
    }
}

class Manager extends Employee{
    private int incentive;

    public Manager(int empid, String name, double salary, int incentive) {
        super(empid, name, salary);
        this.incentive=incentive;
    }

    public double getSalary()
    {
        double tSalary;
        tSalary=super.getSalary()+incentive;
        return tSalary;
    }

}

class Labour extends Employee{
    private  int overtime;

    public Labour(int empid, String name, double salary,int ot) {
        super(empid, name, salary);
        this.overtime=ot;
    }

    public double getSalary()
    {
        double tSalary;
        tSalary=super.getSalary()+(overtime*100);
        return tSalary;
    }
}


public class Q2_EmployeeHierarchy {
    public static void main(String[] args) {

        Employee E1 = new Employee(1001,"ABCD",30000);
        System.out.println("Employee Salary is "+E1.getSalary());


        Manager M1 = new Manager(2005,"BLAH",22600,500);
        Labour L1 = new Labour(3006,"ALAN",18000,50);
        System.out.println("Manager Salary is "+M1.getSalary());
        System.out.println("Labour Salary is "+L1.getSalary());

        System.out.println("Total Salary of all employee: "+(E1.getSalary()+ M1.getSalary()+ L1.getSalary()));


    }

}
//ANOTHER METHOD
/*class Employee {
    int salary;

    public int getSalary() {
        return salary;
    }
}
class Manager extends Employee {
    int incentive;
    @Override
    public int getSalary() {
        return salary+=incentive;
    }
}
class Labour extends Employee{
    int overtime;

    @Override
    public int getSalary() {
        return salary+=overtime;
    }
}
class main {
    public static void main(String[] args) {
Manager mgr = new Manager();
        Labour lab=new Labour();
        mgr.salary=1000;
        mgr.incentive=500;
        System.out.println("Manager Salary="+mgr.getSalary());
        lab.salary=800;
        lab.overtime=100;
        System.out.println("Employee Salary="+lab.getSalary());
        }}*/
