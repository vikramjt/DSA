package com.example.inclass;

public class Question4_ReversePartArray {

    //Question : reverse the given part of integer array
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 4, 8, 1};
        int length = 6;
        reversePartArr(arr, length, 2, 5); // {2, 5, 1, 8, 4, 6}
        int[] arr1 = {3, 4, 6, 2, 5, 2, 1};
        reversePartArr(arr1, 7, 3, 6); // {3, 4, 6, 1, 2, 5, 2}
    }

    public static void reversePartArr(int[] arr, int length, int startIdx, int endIdx){
        int j =endIdx;
        int i = startIdx;
        while(i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        System.out.println("");
        for(i = 0; i< length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
