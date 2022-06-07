package com.example.inclass;

public class Question1_PrintNonMaxInArr {
    //Question : Given N Array elements, count no of elements having at atleast 1 element, greater than itself? {no library function}
    //Input 8 [3 4 5 6 2 5 3 6 ]
    public static void main(String[] args) {
        /* Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0 ; i < length ; i++){
            arr[i] = sc.nextInt();
        } */
        int[] arr = {3, 4, 5, 6, 2, 5, 3, 6};
        int length = 8;
        printIntOtherThanMax(arr, length);
    }

    public static void printIntOtherThanMax(int[] arr, int length){

        int maxInt = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++){
            if(maxInt < arr[i]){
                maxInt = arr[i];
            }
        }
        int count = 0;
        for(int i = 0; i < length; i++){
            if(maxInt != arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
    // above can be made in one loop if seconf for loop condition is put in "else if" condition
}
