package com.example.assignment;

public class Question_EquilibriumIndex {
    public int solve(int[] A) {
        //Prefix Array construction
        int length = A.length;
        int[] pfArr = new int[length];
        int sum = 0;
        for(int i = 0; i < length; i++){
            sum = A[i] + sum;
            pfArr[i] = sum;
        }

        for(int i = 0; i < length; i++){
            int leftSum = 0;
            if( i != 0){
                leftSum = pfArr[i-1];
            }
            int rightSum = pfArr[length-1] - pfArr[i];
            if(leftSum == rightSum){
                //System.out.println(leftSum + " : " + rightSum);
                return i;
            }
        }
        return -1;
    }
}
