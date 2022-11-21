package com.example.assignment;

import java.util.HashMap;
import java.util.Map;

public class Question_Subarray_With_Sum {

    /*
    Q1. Subarray with given sum

    Problem Description
    Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
    If the answer does not exist return an array with a single element "-1".
    First sub-array means the sub-array for which starting index in minimum.

    Problem Constraints
    1 <= length of the array <= 100000
    1 <= A[i] <= 109
    1 <= B <= 109

    Input Format
    The first argument given is the integer array A.
    The second argument given is integer B.

    Output Format
    Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".

    Example Input
    Input 1:
     A = [1, 2, 3, 4, 5]
     B = 5

    Input 2:
     A = [5, 10, 20, 100, 105]
     B = 110

    Example Output
    Output 1: [2, 3]
    Output 2: -1

    Example Explanation
    Explanation 1: [2, 3] sums up to 5.
    Explanation 2: No subarray sums up to required number.
     */

    public int[] solve(int[] A, int B) {
        int length = A.length;
        long[] pfSum = new long[length];
        int[] ans = new int[1];
        pfSum[0] = (long)A[0];
        Map<Long, Integer> pfSumHm = new HashMap<>();
        pfSumHm.put(pfSum[0], 0);
        int startIdx = 0;
        int endIdx = length;
        boolean found = false;
        if(A[0] == B){
            ans = new int[1];
            return ans;
        }
        for(int i = 1 ; i < length; i++){
            pfSum[i] = pfSum[i-1] + (long)A[i];
            pfSumHm.put(pfSum[i], i);
            if(pfSum[i] == B){
                endIdx = i;
                found = true;
                break;
            }
        }
        if(found){
            //System.out.println("found1 , startIdx : " + startIdx + "endIdx : " + endIdx);
            ans = new int[endIdx+1];
            for(int i =0 ; i <= endIdx; i++){
                ans[i] = A[i];
            }
            return ans;
        } else {
            for(int i = 0; i < length; i++){
                //System.out.println(" i : " + i + " pfSum[i] : " + pfSum[i]);
                if(pfSumHm.containsKey(B + pfSum[i])){

                    startIdx = i+1;
                    endIdx = pfSumHm.get(B+pfSum[i]);
                    found = true;
                    break;
                }
            }
            if(found){
                ans = new int[(endIdx + 1) - startIdx];
                //System.out.println("found2 , startIdx : " + startIdx + "endIdx : " + endIdx);
                for(int i = 0, j = startIdx; i < ans.length; i++, j++){
                    ans[i] = A[j];
                }
                return ans;

            } else{
                ans[0] = -1;
                return ans;
            }
        }

    }


}
