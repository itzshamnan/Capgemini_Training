import java.util.HashSet;

public class Q1_EmplyeeHashset {
    int id;
    String name;
    int salary;
    String department;
    HashSet<Q1_EmplyeeHashset> set1=new HashSet<>();
    public Q1_EmplyeeHashset(int id, String name, int salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public String displayDetails()
    {
        return id + " " + name + " " + salary + " "
                + department ;
    }
    public <T> void addtoHash(T object){
        set1.add((Q1_EmplyeeHashset) object);
        System.out.println(set1);
    }



    public static void main(String[] args) {
        Q1_EmplyeeHashset emp1 = new Q1_EmplyeeHashset(1, "Shamnan", 5000, "A4");
        Q1_EmplyeeHashset emp2 = new Q1_EmplyeeHashset(1, "ABCD", 10000, "B4");

        emp1.addtoHash(emp1);
        emp2.addtoHash(emp2);
        System.out.println(emp1.displayDetails());
        System.out.println(emp2.displayDetails());


    }
}
