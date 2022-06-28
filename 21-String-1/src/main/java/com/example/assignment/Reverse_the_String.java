package com.example.assignment;

public class Reverse_the_String {
    /*
    Problem Description
    You are given a string A of size N.

    Return the string A after reversing the string word by word.
    NOTE:
    A sequence of non-space characters constitutes a word.
    Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
    If there are multiple spaces between words, reduce them to a single space in the reversed string.

    Problem Constraints
    1 <= N <= 3 * 105

    Input Format
    The only argument given is string A.

    Output Format
    Return the string A after reversing the string word by word.

    Example Input
    Input 1:
        A = "the sky is blue"
    Input 2:
        A = "this is ib"

    Example Output
    Output 1:
        "blue is sky the"
    Output 2:
        "ib is this"

    Example Explanation
    Explanation 1:
        We reverse the string word by word so the string becomes "the sky is blue".
    Explanation 2:
        We reverse the string word by word so the string becomes "this is ib".
     */
    public String solve(String A) {
        A = A.trim();
        StringBuilder result = new StringBuilder(A);
        reverseStrPart(result, 0 , (A.length()-1));
        int left = 0;
        char[] reverseCharArr = result.toString().toCharArray();
        for(int i =0 ; i < reverseCharArr.length; i++){
            if(reverseCharArr[i] == ' '){
                reverseStrPart(result, left, i-1);
                i++;
                left = i;
            }
        }
        reverseStrPart(result, left, reverseCharArr.length-1);
        return result.toString();
    }

    void reverseStrPart(StringBuilder str, int left, int right){
        while(left < right){
            swapStrChar(str, left, right);
            left++;
            right--;
        }
    }

    public void swapStrChar(StringBuilder str, int i, int j){
        char tmp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, tmp);
    }
}
