public class goodInteger {
    public static String largestGoodInteger(String num) {
        int i = 0,large=0,count=0;
        while(i<num.length()-2){
            int a=num.charAt(i)-'0';
            int b=num.charAt(i+1)-'0';
            int c=num.charAt(i+2)-'0';
            if(a==b && b==c){
                int temp=(a*100)+(a*10)+a;
                large=large>temp?large:temp;
            }
            if(a==0 && b==0 && c==0)
                count=1;
            i++;
        }
        if(large>0)
            return String.valueOf(large);
        if(count==1)
            return "000";
        return "";
    }   
    public static void main(String []args){
        System.out.println(largestGoodInteger("12300012666"));
    }
}

//
// Largest 3-Same-Digit Number in String
    // You are given a string num representing a large integer. An integer is good if it meets the following conditions:

    // It is a substring of num with length 3.
    // It consists of only one unique digit.
    // Return the maximum good integer as a string or an empty string "" if no such integer exists.

    // Note:

    // A substring is a contiguous sequence of characters within a string.
    // There may be leading zeroes in num or a good integer.

    // Example 1:

    // Input: num = "6777133339"
    // Output: "777"
    // Explanation: There are two distinct good integers: "777" and "333".
    // "777" is the largest, so we return "777".
    // Example 2:

    // Input: num = "2300019"
    // Output: "000"
    // Explanation: "000" is the only good integer.
    // Example 3:

    // Input: num = "42352338"
    // Output: ""
    // Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
//