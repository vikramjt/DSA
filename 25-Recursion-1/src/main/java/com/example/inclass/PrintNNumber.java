package com.example.inclass;

public class PrintNNumber {
    /*
    Given a no N print all the nos. from N to 1 in decreasing order
     */
    void print(int N){
        if(N == 1){
            System.out.print(N + " " );
        } else {
            System.out.print(N + " " );
            print(N-1);
        }
    }

    public static void main(String[] args) {
        new PrintNNumber().print(5);
    }
}
