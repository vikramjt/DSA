package com.example.inclass;

public class Reverse_Char_Array {

    /*

    reverse the string sentence word from last to first

    ex 1: This is Vikram
    o/p => Vikram is This

    ex 2: We are going on picnic
    o/p => picnic on going are We

     */

    String reverseCharArraySentenceWork(String sentence){
        String reverseWhole = reverseStrPart(sentence, 0 , (sentence.length()-1));
        int left = 0;
        char[] reverseCharArr = reverseWhole.toCharArray();
        String result = reverseWhole;
        for(int i =0 ; i < reverseCharArr.length; i++){
            if(reverseCharArr[i] == ' '){
                result = reverseStrPart(result, left, i-1);
                i++;
                left = i;
            }
        }
        result = reverseStrPart(result, left, reverseCharArr.length-1);

        return result;
    }

    String reverseStrPart(String str, int left, int right){
        while(left < right){
            str = swapStrChar(str, left, right);
            left++;
            right--;
        }
        return str;
    }

    String swapStrChar(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Reverse_Char_Array().reverseCharArraySentenceWork("This is Vikram"));
    }
}
