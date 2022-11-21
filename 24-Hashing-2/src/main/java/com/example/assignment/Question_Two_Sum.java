package com.example.assignment;

import java.util.HashSet;
import java.util.Set;

public class Question_Two_Sum {

    /*
    Q4. 2 Sum

    Problem Description
    Given an array of integers, find two numbers such that they add up to a specific target number.
    The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2.
    Please note that your returned answers (both index1 and index2 ) are not zero-based.
    Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ).
    Note that, if no pair exists, return empty list.
    If multiple solutions exist, output the one where index2 is minimum.
    If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.
    Input: [2, 7, 11, 15], target=9
    Output: index1 = 1, index2 = 2
     */
    public int[] twoSum(final int[] A, int B) {

        Set<Integer> hs = new HashSet<>();
        int[] ans = new int[2];
        int lastIndex = -1;
        for (int i = 0; i < A.length; i++){
            int a = A[i];
            int b = B-a;
            if(hs.contains(b)){
                lastIndex = i;
                break;
            } else {
                hs.add(a);
            }
        }
        int firstIdx = -1;
        if(lastIndex == -1){
            return new int[0];
        } else {
            int b = A[lastIndex];
            int a = B-b;
            for(int i =0; i < A.length; i++){
                if(A[i] == a){
                    firstIdx = i;
                    break;
                }
            }
        }

        ans[0] = firstIdx + 1;
        ans[1] = lastIndex + 1;
        return ans;
    }
}
