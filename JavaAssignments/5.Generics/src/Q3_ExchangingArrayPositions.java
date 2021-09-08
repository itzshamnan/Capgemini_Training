import java.util.Arrays;

public class Q3_ExchangingArrayPositions {
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] arr={2,3,4,5,6,7};
        System.out.println("Original Array");
        System.out.println(Arrays.toString(arr));
        swap(arr,3,1);
        System.out.println("After swapping ");
        System.out.println(Arrays.toString(arr));
    }
}
