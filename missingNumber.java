import java.util.Scanner;

public class missingNumber {
   
    private static int missingNum(int n, int[] arr) {
        int sum = n*(n+1)/2;
        int arrSum=0;
        for(int i:arr) arrSum+=i;
        return sum-arrSum;
    }
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n-1];
        for (int i=0;i<n-1;i++)arr[i] = scan.nextInt();
        scan.close();
        System.out.println(missingNum(n, arr));
    }
}