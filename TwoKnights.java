import java.util.*;
public class TwoKnights {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        scan.close();
        for(int i=1; i<=k; i++) {
            int res = (((i*i)*((i*i)-1))/2) - (4*(i-1)*(i-2));
            System.out.println(res);
        }
    }
}
