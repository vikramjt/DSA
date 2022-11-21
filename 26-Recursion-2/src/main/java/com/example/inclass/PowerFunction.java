package com.example.inclass;

public class PowerFunction {

    /* Given power function: given  "a" and "N" then calc a^N*

     */

    int powerFunc(int a, int N){
        if(N==1){
            return a;
        } else {
            return a * powerFunc(a, N-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(" 3 ^ 3 : " + new PowerFunction().powerFunc(3, 3));
    }
}
