//Element Appearing More Than 25% In Sorted Array


//CODE:

import java.util.*;
class MajorityArr {
    public static int findSpecialInteger(int[] arr) {
        int n=(arr.length)*25/100;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i))
                map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }
        int max=0,val=0;
        for(Map.Entry<Integer,Integer> i:map.entrySet()){
            if(i.getValue()>max){
                max=i.getValue();
                val=i.getKey();
            }

        }
        if(max>=n)
            return val;
        return 0;
    }
    public static void main(String[]args){
	int arr[]={1,2,5,6,6,6,6};
	System.out.println(findSpecialInteger(arr));
    }
}



// DISCRIPTION

// Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

 

// Example 1:

// Input: arr = [1,2,2,6,6,6,6,7,10]
// Output: 6
// Example 2:

// Input: arr = [1,1]
// Output: 1
 

// Constraints:

// 1 <= arr.length <= 104
// 0 <= arr[i] <= 105