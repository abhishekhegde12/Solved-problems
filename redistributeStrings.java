// Redistribute Characters to Make All Strings Equal

//CODDE:

import java.util.*;
class redistributeStrings {
    public static boolean makeEqual(String[] words) {
        if(words.length==1)
            return true;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                char m=words[i].charAt(j);
                if(map.containsKey(m))
                    map.put(m,map.get(m)+1);
                else map.put(m,1);
            }
        }
        for(Map.Entry<Character,Integer> i:map.entrySet()){
            if(i.getValue()%words.length!=0)
                return false;
        }
        return true;
    }
	public static void main(String[]args){
		String[]word={"caaaaa","aaaaaaaaa","a","bbb","bbbbbbbbb","bbb","cc","cccccccccccc","ccccccc","ccccccc","cc","cccc","c","cccccccc","c"};
		System.out.println(makeEqual(word));
	}
}


//DISCRIPTION:

// You are given an array of strings words (0-indexed).

// In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].

// Return true if you can make every string in words equal using any number of operations, and false otherwise.

 

// Example 1:

// Input: words = ["abc","aabc","bc"]
// Output: true
// Explanation: Move the first 'a' in words[1] to the front of words[2],
// to make words[1] = "abc" and words[2] = "abc".
// All the strings are now equal to "abc", so return true.
// Example 2:

// Input: words = ["ab","a"]
// Output: false
// Explanation: It is impossible to make all the strings equal using the operation.
 

// Constraints:

// 1 <= words.length <= 100
// 1 <= words[i].length <= 100
// words[i] consists of lowercase English letters.