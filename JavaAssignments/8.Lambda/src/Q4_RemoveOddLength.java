import java.util.ArrayList;
import java.util.List;

public class Q4_RemoveOddLength {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();

        list1.add("HI");
        list1.add("How are You");
        list1.add("Hello World");
        list1.add("Nice to meet you");
        list1.add("Core Java RULES");
        list1.add("Nah it's confusing");
        list1.add("Cheers to the future");
        list1.removeIf(s->s.length()%2!=0);

        list1.forEach(System.out::println);

    }
}
