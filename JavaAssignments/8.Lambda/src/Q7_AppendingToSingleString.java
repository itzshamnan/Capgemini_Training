import java.util.HashMap;
import java.util.Set;

public class Q7_AppendingToSingleString {
    public static void main(String[] args) {

        HashMap<Integer,String > hashMap1 = new HashMap<>();

        hashMap1.put(1,"Appending");
        hashMap1.put(2,"every");
        hashMap1.put(3,"key-value");
        hashMap1.put(4,"pairs");
        hashMap1.put(5,"into");
        hashMap1.put(6,"single");
        hashMap1.put(7,"string");

        Set s = hashMap1.entrySet();
        StringBuilder str = new StringBuilder();

        s.forEach(str1->str.append(str1));

        System.out.println(str);

    }
}
