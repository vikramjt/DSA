package com.example.inclass;

public class PrintNNumberAsc {

    /*
    Given a no N print all the nos. from N to 1 in decreasing order
     */
    void print(int N){
        if(N == 1){
            System.out.print(N + " " );
        } else {
            print(N-1);
            System.out.print(N + " " );
        }
    }

    public static void main(String[] args) {
        new PrintNNumberAsc().print(5);
    }
}
