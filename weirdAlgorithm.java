import java.util.Scanner;

public class weirdAlgorithm {


    private static void WeirdAlgo(int n) {
        
        while(n != 1) {
            if(n%2 != 0) 
                n=(n*3)+1;
            else n/=2;
            System.out.println(n);
        }
        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        WeirdAlgo(n);
    }
}