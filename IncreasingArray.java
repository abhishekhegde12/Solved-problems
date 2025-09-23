import java.util.*;

public class IncreasingArray {

    private static int arrayMoves(int[] arr) {
        int moves = 0;
        int i = 0, j = i+1;
        
        for(i=0; i<arr.length-1; i++, j++) {
            if(arr[i] > arr[j]){
                moves+= arr[i]-arr[j];
                arr[j] = arr[i];
            }
        }
        return moves;
    
    } 

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = scan.nextInt();
        scan.close();

        System.out.println(arrayMoves(arr));

    }
}

// 3 2 5 1 7