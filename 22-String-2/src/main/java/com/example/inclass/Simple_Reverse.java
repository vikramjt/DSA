package com.example.inclass;

public class Simple_Reverse {

    /*
    Q2. Simple Reverse
    Problem Description
    Given a string A, you are asked to reverse the string and return the reversed string.

    Problem Constraints
    1 <= |A| <= 105
    String A consist only of lowercase characters.

    Input Format
    First and only argument is a string A.

    Output Format
    Return a string denoting the reversed string.

    Example Input
    Input 1: A = "scaler"
    Input 2: A = "academy"

    Example Output
    Output 1: "relacs"
    Output 2: "ymedaca"

    Example Explanation
    Explanation 1: Reverse the given string.

     */
    public String solve(String A) {
        StringBuilder str = new StringBuilder(A);
        int left = 0;
        int right = A.length()-1;
        while(left < right){
            swapStrChar(str, left, right);
            left++;
            right--;
        }
        return str.toString();
    }

    public void swapStrChar(StringBuilder str, int i, int j){
        char tmp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, tmp);
    }
}
