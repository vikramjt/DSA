package com.example.inclass;

public class PalindromStr {

    boolean isPalindrom(String str){
        char[] arr = str.toCharArray();
        if(arr.length%2 == 0){
            int left = arr.length/2;
            int right = arr.length/2-1;
            for(int i = left, j = right; i < arr.length; i++, j--){
                if(!(arr[i] == arr[j])){
                    return false;
                }
            }
        } else {
            int mid = arr.length/2;
            for(int i = mid+1, j = 1; i < arr.length ; i++, j++) {
                if (!(arr[mid - j] == arr[mid + j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(" WOW : " + new PalindromStr().isPalindrom("WOW"));
        System.out.println(" MOMM : " + new PalindromStr().isPalindrom("MOMM"));

        System.out.println(" EMME : " + new PalindromStr().isPalindrom("EMME"));

        System.out.println(" EMMM : " + new PalindromStr().isPalindrom("EMMM"));
    }
}
