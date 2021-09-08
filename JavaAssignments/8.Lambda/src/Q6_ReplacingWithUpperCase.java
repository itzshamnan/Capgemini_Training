import java.util.ArrayList;
import java.util.List;

public class Q6_ReplacingWithUpperCase {
    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();
        list1.add("hi");
        list1.add("nice");
        list1.add("to");
        list1.add("meet");
        list1.add("you");

        System.out.println("Original list");
        System.out.println(list1);

        list1.replaceAll(str->str.toUpperCase());
        System.out.println("Using replaceAll to change cases ");
        System.out.println(list1);
    }
}
