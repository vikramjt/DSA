package com.example.assignment;

public class Question_Length_Longest_Cons_1 {
    /*
    Q1. Length of longest consecutive ones

    Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.

    Input Format: The only argument given is string A.
    Output Format: Return the length of the longest consecutive 1’s that can be achieved.

    Constraints:
    1 <= length of string <= 1000000
    A contains only characters 0 and 1.

    For Example:
    Input 1:
        A = "111000"
    Output 1:
        3
    Input 2:
        A = "111011101"
    Output 2:
        7

     */

    public static int solve(String A) {

        char[] arr = A.toCharArray();
        int count = Integer.MIN_VALUE;
        int lengthA = arr.length;
        int noOfOnes = 0;
        for(int i =0; i < lengthA; i++){
            if(arr[i] == '1'){
                noOfOnes++;
            }
        }
        if(lengthA == noOfOnes){
            return lengthA;
        }
        for(int i =0; i < lengthA; i++){
            if(arr[i] == '0'){
                int rightSum = 0;
                for(int j=i-1; j >=0; j--){
                    if(arr[j] == '1'){
                        rightSum++;
                    } else break;
                }
                int leftSum = 0;
                for(int j=i+1; j < arr.length; j++){
                    if(arr[j] == '1'){
                        leftSum++;
                    } else break;
                }

                if(noOfOnes == (leftSum+ rightSum)){
                    if(count < leftSum + rightSum ){
                        count = leftSum + rightSum;
                    }
                } else {
                    if(count < leftSum + rightSum + 1){
                        count = leftSum + rightSum + 1;
                    }
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println ( " 111011101 : " + solve("111011101"));
        System.out.println ( " 1110111 : " + solve("1110111"));
    }
}
