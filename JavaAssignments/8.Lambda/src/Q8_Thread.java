import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Q8_Thread {
    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        Consumer<List<Integer>> display = list2->list2.forEach(System.out::println);
        Thread t = new Thread();
        t.run();
    }
}
