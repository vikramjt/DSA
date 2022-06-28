package com.example.assignment;

public class Question_Magic_Number_Five_Power {

    /*
    Problem Description:
    Given an integer A, find and return the Ath magic number.
    A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.
    First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….

    Problem Constraints
    1 <= A <= 5000

    Input Format
    The only argument given is integer A.

    Output Format
    Return the Ath magic number.

    Example Input
    Example Input 1:
     A = 3
    Example Input 2:
     A = 10

    Example Output
    Example Output 1: 30
    Example Output 2: 650

    Example Explanation
    Explanation 1:
     Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
     3rd element in this is 30
    Explanation 2:
     In the sequence shown in explanation 1, 10th element will be 650.


    Solution: Hint
    the unique power means the binary representation of the power of the 5
    5^0 + 5^1 + 5^2 ...... + 5^A

    So first get the binary
     */

    public int solve(int A) {
        int temp = A;
        int degree = 0;
        int result = 0;
        while(temp > 0){
            degree++;
            if((temp & 1) == 1){
                result = result + powerOfFive(degree);
            }
            temp = temp>>1;
        }
        return result;
    }

    public int powerOfFive(int power){
        int result = 1;
        for(int i =0; i < power; i++){
            result = result * 5;
        }
        return result;
    }
}
