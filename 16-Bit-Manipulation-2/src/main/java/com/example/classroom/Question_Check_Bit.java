package com.example.classroom;

public class Question_Check_Bit {

    /*
    Check if the ith position is set bit or not in the N number
     */

    public static boolean checkBit(int N, int i){
        if(((N>>i)&1) == 1){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println("N: 26 , i : 2, result : " + checkBit(26, 2));
    }
}
