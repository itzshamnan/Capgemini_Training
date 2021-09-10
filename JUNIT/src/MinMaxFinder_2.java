import java.util.Arrays;

class Result{
    int min;
    int max;

    public Result(int min, int max) {
        this.min = min;
        this.max = max;
    }
}

public class MinMaxFinder_2 {

    public Result FindMinMax2(int[] a)
    {
        if (a.length==0)
            throw new ArrayStoreException("Array size is zero");

        int [] result = new int[10];
        Arrays.sort(a);
        if (result[0] == result[1])
            throw new ArrayStoreException("all array elements are same..!!");
        Result r = new Result(a[0],a[a.length-1]);
        return r;

    }
}
