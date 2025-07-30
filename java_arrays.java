/*
Given an array arr[] containing the prices of items, your task is to calculate the average of all prices, rounded to two decimal places.
Note:  Return the average of all the items as a String.

Examples:

Input: arr[] = [1, 2, 3, 4, 5]
Output: 3.00 
Explanation: Sum of the array is 15, hence average is 15/5=3.00. 
*/

//solution

class Solution {
    public String average(int arr[]) {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        
        double avg = (double)sum/arr.length;
        
        String result = String.format("%.2f", avg);
        return result;
    }
}
