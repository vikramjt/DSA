package com.example.assignment;

public class Question_No_of_Doors_Alternative {
    /*
    There are 100 doors, all closed. In a nearby cage are 100 monkeys.

    The first monkey is let out and runs along the doors opening every one.
    The second monkey is then let out and runs along the doors closing the 2nd, 4th, 6th,…
    - all the even-numbered doors. The third monkey is let out. He attends only to the 3rd, 6th, 9th,… doors
    (every third door, in other words), closing any that is open and opening any that is closed, and so on.
    After all 100 monkeys have done their work in this way, what state are the doors in after the last pass?

    Answer with the number of open doors.

    Answer is an integer. Just put the number without any decimal places if it's an integer.
    If the answer is Infinity, output Infinity.

    Feel free to get in touch with us if you have any questions
     */

    static int factorial (int A){
        int noOfFactorial = 1;
        for(int i =2 ; i <=A/2; i++){
            if(A % i == 0){
                noOfFactorial++;
            }
        }
        noOfFactorial++;
        return noOfFactorial;
    }

    public static void main(String[] args) {
        int count = 1;
        for(int i = 2; i <= 100; i++){
            if(factorial(i) %2 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
