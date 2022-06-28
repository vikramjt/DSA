package com.example.assignment;

public class Question_Majority_Element_Moor_Voting_Algo {
    /*
    ################## Google Question ###################
    Problem Description
    Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
    You may assume that the array is non-empty and the majority element always exists in the array.

    Problem Constraints
    1 <= N <= 5*105
    1 <= num[i] <= 109

    Input Format
    Only argument is an integer array.

    Output Format
    Return an integer.

    Example Input
    [2, 1, 2]

    Example Output
    2

    Example Explanation
    2 occurs 2 times which is greater than 3/2.
    */


    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        int majElem = A[0];
        int count = 1;
        for(int i = 1; i < A.length; i++){
            if(majElem == A[i]){
                count++;
            } else if(count == 0){
                majElem = A[i];
            } else {
                count --;
            }
            //System.out.println("majElem: " + majElem + " :: count : " + count);
        }
        count = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] == majElem){
                count++;
            }
        }
        if(count > A.length/2){
            return majElem;
        } else {
            return -1;
        }
    }
}
