package com.example.assignment;

public class Question_RemoveIndex_Google {
    /*
     Question : Count ways to make sum of odd and even indexed elements equal by removing an array element
     Note: This question was asked in one of the google company interview

     Problem Description:
    Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.

    Problem Constraints::
    1 <= n <= 105
    -105 <= A[i] <= 105

    Input Format:::
    First argument contains an array A of integers of size N


    Output Format:::
    Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



    Example Input::
    Input 1:
    A=[2, 1, 6, 4]
    Input 2:

    A=[1, 1, 1]


    Example Output:::
    Output 1:
    1
    Output 2:
    3


    Example Explanation
    Explanation 1:
    Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
    Therefore, the required output is 1.
    Explanation 2:

    Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
    Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
    Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
    Therefore, the required output is 3.
     */
    public int solve(int[] A) {
        int length = A.length;
        int[] pfEvenSum = new int[length];
        int[] pfOddSum = new int[length];

        pfEvenSum[0] = A[0];
        pfOddSum[0] = 0;
        for(int i =1 ; i<length; i++){
            if(i%2 == 0){
                pfEvenSum[i] = A[i] + pfEvenSum[i-1];
                pfOddSum[i] = pfOddSum[i-1]; // the previous sum needs to be added when the index is even
            } else{
                pfOddSum[i] = A[i] + pfOddSum[i-1];
                pfEvenSum[i] = pfEvenSum[i-1]; // the previous sum needs to be added when the index is odd
            }
        }

        int count = 0;

        for(int i =0 ; i < length; i++){
            int sumOdd = 0;
            int sumEven = 0;
            if(i == 0){
                sumOdd = pfEvenSum[length-1];
                sumEven = pfOddSum[length-1];
            } else {
                sumOdd = pfOddSum[i-1] + (pfEvenSum[length-1] - pfEvenSum[i]);
                sumEven = pfEvenSum[i-1] + (pfOddSum[length-1] - pfOddSum[i]);
            }
            if(sumEven == sumOdd){
                count++;
            }
        }
        return count;
    }
}
