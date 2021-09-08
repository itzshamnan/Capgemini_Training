import java.util.Scanner;

public class Q7_Q8_ArrayOperation {
    public static void main(String[] args)
    {
        int i;
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[15];
        System.out.println("Enter array elements");
        for(i=0;i<15;i++)
        {
            arr[i]=scan.nextInt();
        }
        for(i=0;i<15;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nEnter the element to be searched");
        int n=scan.nextInt();
        for(i=0;i<15;i++)
        {
            if(arr[i]==n)
                System.out.println("Element found at "+(i+1)+"th position");
        }
        for (i = 0; i < 15; i++) {
            for (int j = 0; j < 15 - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(i=0;i<15;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
