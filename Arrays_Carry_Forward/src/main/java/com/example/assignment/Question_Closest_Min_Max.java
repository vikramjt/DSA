package com.example.assignment;

public class Question_Closest_Min_Max {

    /*

    Question: Closest MinMax

    Problem Description
    Given an array A, find the size of the smallest subarray
    such that it contains at least one occurrence of the maximum value of the array
    and at least one occurrence of the minimum value of the array.

    Problem Constraints
    1 <= |A| <= 2000

    Input Format
    First and only argument is vector A

    Output Format
    Return the length of the smallest subarray which has at
    least one occurrence of minimum and maximum element of the array

    Example Input
    Input 1:
    A = [1, 3]
    Input 2:
    A = [2]

    Example Output
    Output 1:
     2
    Output 2:
     1

    Example Explanation
    Explanation 1:
     Only choice is to take both elements.
    Explanation 2:
     Take the whole array.
     */

    public class Solution {
        public int solve(int[] A) {

            int result = 0;
            if(A.length == 1){
                return 1;
            } else if(A.length == 2){
                if(A[0] == A[1]){
                    return 1;
                }
                return 2;
            }

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i =0; i < A.length; i++){
                if(max < A[i]){
                    max = A[i];
                }
                if(min > A[i]){
                    min = A[i];
                }
            }
            if(min == max){
                return 1;
            }
            int maxPos = -1;
            int minPos = -1;
            int minDistance = Integer.MAX_VALUE;
            for(int i = A.length-1; i >= 0 ; i--){
                if(A[i] == max){
                    maxPos = i;
                } else if(A[i] == min){
                    minPos = i;
                }
                if(maxPos != -1 && minPos != -1){
                    int temp = Math.abs(maxPos - minPos) + 1;
                    if(minDistance > temp){
                        minDistance = temp;
                    }
                }
            }
            result = minDistance;
            return result;
        }
    }

}
