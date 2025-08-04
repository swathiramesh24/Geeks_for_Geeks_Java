/*
Input: S1 = "Geeks" , S2 = "forGeeks"
Output: "skeeGrofskeeG" 
Explanation: Concatenating S1 and S2 to 
get "GeeksforGeeks" then reversing it to 
"skeeGrofskeeG".
*/

//code
class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        String S3 = S1 + S2;
        StringBuilder str = new StringBuilder(S3);
        str.reverse();
        String reversedString = str.toString();
        
        return reversedString;
    }
}
