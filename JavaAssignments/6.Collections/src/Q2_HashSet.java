import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Q2_HashSet {
    public static void main(String[] args) {
        ArrayList<String> obj=new ArrayList<>();
        obj.add("MCU");
        obj.add("DCU");
        obj.add("Iron Man");
        obj.add("Batman");
        obj.add("Captain America");
        obj.add("Superman");
        obj.add("Spider Man");
        obj.add("Flash");

        HashSet<String> set=new HashSet<String>(obj);
        set.add("Flash");
        set.add("DCU");

        Iterator<String> itr=set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
