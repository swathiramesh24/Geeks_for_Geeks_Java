/*
Input: a = 5.43, b = 2.653
Output: [2.0467393, 2.047]
Explanation: a/b and decimal precision of a/b up to 3 places after the decimal point are given.
*/

//solution
class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        
        ArrayList<Float> result = new ArrayList<>();
        
        float c = a/b;
        
        float d = Math.round(c * 1000f) / 1000f;
        
        result.add(c);
        result.add(d);
        
        return result;
        
    }
}

//ArrayList<Float> this means the array name is ArrayList and it holds float values
