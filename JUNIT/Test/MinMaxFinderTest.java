import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MinMaxFinderTest {
    @Test
       public void testMinMax1() {
           MinMaxFinder m = new MinMaxFinder();
           int[] arr = {24,48,109,38,5,91};
           int [] arr1 = new int[10];
           arr1[0]=5;
           arr1[1]=109;
           int i= Arrays.stream(arr).min().getAsInt();
           int j= Arrays.stream(arr).max().getAsInt();
           Assert.assertArrayEquals("minmax are: ",arr1,m.FindMinMax(arr));
       }


    @Test
    public void testMinMax2() {
        MinMaxFinder m = new MinMaxFinder();
        int[] arr = {100,200,10,800,300,400};
        int [] arr1 = new int[10];
        arr1[0]=10;
        arr1[1]=800;
        int i= Arrays.stream(arr).min().getAsInt();
        int j= Arrays.stream(arr).max().getAsInt();
        Assert.assertArrayEquals("minmax are: ",arr1,m.FindMinMax(arr));
    }



    @Test(expected = ArrayStoreException.class)
    public void testArray() {
        MinMaxFinder m1 = new MinMaxFinder();
        int[] a1 = new int[0];
        m1.FindMinMax(a1);

    }

    @Test(expected = ArrayStoreException.class)
    public void test1Array() {
        MinMaxFinder m1 = new MinMaxFinder();
        int[] a1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        m1.FindMinMax(a1);

    }
}

