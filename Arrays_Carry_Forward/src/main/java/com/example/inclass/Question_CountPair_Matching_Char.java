package com.example.inclass;

public class Question_CountPair_Matching_Char {
    /*
    Give a char[] array , calculate the no of pairs [i, j] such that i < j
    and s[i] == 'a' and s[j] == 'g'
    all characters are lowercase alphabets [ a b c d....]

    Example :
    arr -> b a a g d c a g
    idx -> 0 1 2 3 4 5 6 8
    pair <1, 3> <2, 3> <6, 7> <1, 7> <2, 7>

    output: 5
     */

    //BruteForce Approach
    public int solveBf(char[] arr, char first, char second){

        int count =0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == first) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j] == second) {
                        count++;
                    }
                }
            }
        }
        return count;

        // TC (N * N)
    }

    //optimized way to solve it
    //Carry forward from last to front
    public int solve(char[] arr, char first, char second){
        int count = 0;
        int carryForwardCount = 0;
        for (int i = arr.length-1; i >=0; i--){
            if(arr[i] == second){
                carryForwardCount ++;
            } else if(arr[i] == first){
                count = count + carryForwardCount;
            }
        }
        return count;
        //TC (N)
    }

    //optimized way to solve it
    //Carry forward from front to last
    public int solve2(char[] arr, char first, char second){
        int count = 0;
        int carryForwardCount = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == first){
                carryForwardCount ++;
            } else if(arr[i] == second){
                count = count + carryForwardCount;
            }
        }
        return count;
        //TC (N)
    }

    public static void main(String[] args) {
        Question_CountPair_Matching_Char test = new Question_CountPair_Matching_Char();
        char[] arr = {'b', 'a', 'a', 'g', 'd', 'c', 'a', 'g'};
        System.out.println("First: " + test.solve(arr, 'a', 'g'));
        System.out.println("Second: " + test.solve2(arr, 'a', 'g'));
        System.out.println("Brute Force: " + test.solveBf(arr, 'a', 'g'));
    }
}
