package com.example.assignment;

import java.util.Scanner;

public class Question_RotateArr {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        /*Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for(int i = 0; i < length ; i++){
            arr[i] = sc.nextInt();
        }
        int forwardArr = sc.nextInt();*/
        //input #######
        int [] arr = {2,3,4,7,2,5,6,3,6};
        int length = 9;
        int forwardArr = 4;
        if(forwardArr > length){
            forwardArr = forwardArr % length;
        }
        reversePartArr(arr, length, 0, length-1);
        reversePartArr(arr, length, 0, forwardArr - 1);
        reversePartArr(arr, length, forwardArr, length-1);

        for(int i = 0; i< length ; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void reversePartArr(int[] arr, int length, int startIdx, int endIdx){
        int j =endIdx;
        int i = startIdx;
        while(i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
