import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Q5_FirstLetter {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Orange");
        list1.add("Hear");
        list1.add("Mississippi");
        list1.add("Andromeda");
        list1.add("Nutella");
        Consumer<List<String>> displaylist = list->list.forEach(System.out::println);
        System.out.println("Elements in the List: ");
        displaylist.accept(list1);
        StringBuilder s1 = new StringBuilder();
        Consumer<List<String>> modify = list2->list2.forEach(s ->s1.append(s.charAt(0)));
        modify.accept(list1);

        System.out.println("String with first letter of list elements:");
        System.out.println(s1);


    }
}
