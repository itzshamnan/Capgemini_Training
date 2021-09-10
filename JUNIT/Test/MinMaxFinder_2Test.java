import org.junit.Assert;
import org.junit.Test;

public class MinMaxFinder_2Test {
    @Test
    public void testMinMax2() {
        MinMaxFinder_2 m1 = new MinMaxFinder_2();
        int[] arr = {123,34,565,87,435};
        Result r1 = m1.FindMinMax2(arr);
        Result r2 = m1.FindMinMax2(arr);
        Assert.assertEquals(r1.max,r2.max);
    }
    @Test(expected = ArrayStoreException.class)
    public void test1Array() {
        MinMaxFinder_2 m1 = new MinMaxFinder_2();
        int[] a1 = {2,2,2,2};
        m1.FindMinMax2(a1);

    }

}