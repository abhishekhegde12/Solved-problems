import java.util.*;

public class RepetitionString {

    private static int repeatSequence(String str) {
        if(str.isEmpty()) return -1;
        if(str.length() < 2) return 1;

        int count=1, maxCount=0;
        int i=0,j=i+1;
        while(j < str.length()) {
            if(str.charAt(i) == str.charAt(j)) {
                j++;
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count=1;
                i=j;
                j++;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        str = str.toLowerCase();
        int res = repeatSequence(str);
        System.out.println(res);
        scan.close();
    }
}