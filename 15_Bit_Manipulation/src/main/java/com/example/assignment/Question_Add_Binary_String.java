package com.example.assignment;

public class Question_Add_Binary_String {

    /*
    Q2. Add Binary Strings
    Problem Description
    Given two binary strings, return their sum (also a binary string).
    Example:
    a = "100"
    b = "11"
    Return a + b = "111".
     */
    public String addBinary(String A, String B) {

        char[] arrA = A.toCharArray();
        char[] arrB = B.toCharArray();
        int lengthA = arrA.length;
        int lengthB = arrB.length;
        int carry = 0;
        StringBuffer result = new StringBuffer();
        for(int i = lengthA - 1, j = lengthB - 1; i >=0 || j >= 0; i--, j--){
            String tmp = result.toString();
            result = new StringBuffer();
            if(i < 0){
                if(carry == 1 && arrB[j] == '1'){
                    carry = 1;
                    result.append("0").append(tmp);
                } else if(carry == 1 && arrB[j] == '0'){
                    carry = 0;
                    result.append("1").append(tmp);
                } else {
                    result.append(arrB[j]).append(tmp);
                }
            } else if (j < 0){
                if(carry == 1 && arrA[i] == '1'){
                    carry = 1;
                    result.append("0").append(tmp);
                } else if(carry == 1 && arrA[i] == '0'){
                    carry = 0;
                    result.append("1").append(tmp);
                } else {
                    result.append(arrA[i]).append(tmp);
                }

            }else if(arrA[i] == '1' && arrB[j] == '1'){
                if(carry == 1){
                    result.append("1").append(tmp);
                } else {
                    result.append("0").append(tmp);
                }
                carry = 1;
            } else if(arrA[i] == '0' && arrB[j] == '0'){
                if(carry == 1){
                    result.append("1").append(tmp);
                } else {
                    result.append("0").append(tmp);
                }
                carry = 0;
            } else if(arrA[i] == '1' && arrB[j] == '0'){
                if(carry == 1){
                    result.append("0").append(tmp);
                    carry = 1;
                } else {
                    result.append("1").append(tmp);
                    carry = 0;
                }
            } else if(arrA[i] == '0' && arrB[j] == '1'){
                if(carry == 1){
                    result.append("0").append(tmp);
                    carry = 1;
                } else {
                    result.append("1").append(tmp);
                    carry = 0;
                }
            }
        }
        if(carry == 1){
            String tmp = result.toString();
            result = new StringBuffer();
            result.append("1").append(tmp);
        }
        return result.toString();

    }
}
