import java.util.*;

public class Permutations {
 
    private static void printPermutation(int n) {
        if(n<=3) {
            System.out.println("NO SOLUTION");
            return;
        }
        for(int i=1; i<=n; i++) {
            if(i%2==0)
                System.out.print(" "+i);
        }
        for(int i=1; i<=n; i++) {
            if(i%2!=0)
                System.out.print(" "+i);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int n = scan.nextInt();
        scan.close();
        
        printPermutation(n);
    }
}