package com.example.inclass;

public class Question3_ReverseArray {

    //Question : reverse the given integer array
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 4, 8, 1};
        int length = 6;
        reverseArr(arr, length);
        int[] arr1 = {3, 4, 6, 2, 5, 2, 1};
        reverseArr(arr1, 7);
    }

    public static void reverseArr(int[] arr, int length){
        int j = length-1;
        int i = 0;
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
