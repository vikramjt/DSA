package com.vikram;

import java.util.Scanner;

public class CalcSquareRoot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(calcSquareRoot(input));
    }

    public static int calcSquareRoot(int A){
        int newMiddle = A/2;
        int right = 0;
        int left = 0;
        int middle = 0;
        if(A ==1){
            return 1;
        }
        while(true){
        /*System.out.print("NewMiddle : " + newMiddle);
        System.out.print(" :: right : " + right);
        System.out.println (" :: left : " + left);*/

            middle = newMiddle;
            if(right-left == 1 || left-right == 1){
                return -1;
            }
            long middleSqr = (long)middle * middle;
            //System.out.println(" middleSqr : " + middleSqr);
            if(middleSqr == A){
                return middle;
            } else if (middleSqr > Long.parseLong(A+"")){
                newMiddle = calcMiddle(left, middle);
                right = middle;
            } else {
                left = middle;
                newMiddle = calcMiddle(left, right);
            }
        }
    }

    public static int calcMiddle(int small, int big){
        return small + ((big - small)/2);
    }
}
