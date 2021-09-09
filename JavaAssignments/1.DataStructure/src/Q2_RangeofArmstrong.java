//Armstrong Numbers between the range 100-1000
public class Q2_RangeofArmstrong {
    public static void main(String[] args)
    {
        int n, rem, sum = 0;
        for(int i = 100; i < 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                rem = n % 10;
                sum = sum + (rem * rem * rem);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}
