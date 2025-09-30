import java.util.*;
public class TriangularSum {

    private static int triangleSum(int[] nums ) {
        if(nums.length<=0) return -1;
        
        if(nums.length == 1) return nums[0];
        
        int len=nums.length-1;
        while(nums[1] != -999) {
            for(int i=0; i<len; i++) {
                nums[i] = (nums[i] + nums[i+1])%10;
                if(i == len-1) {
                    nums[len] = -999;
                    len--;
                }
            }
        }
        return nums[0];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        scan.close();
        
        System.out.println(triangleSum(arr));
    }
}