import java.util.Arrays;

public class Q3_ArrayList {
    public void Q3_ArrayList() {
    }

    public static void main(String[] args) {
        String str = "A quick brown fox jumps over a lazy frog";
        String[] arrlist = str.split(" ");
        System.out.println(Arrays.toString(arrlist));
        String[] str2 = (String[])Arrays.stream(arrlist).toArray((size) -> {
            return new String[size];
        });
        System.out.println(Arrays.toString(str2));
    }
}
