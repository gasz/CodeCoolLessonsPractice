package com.company;

import java.util.ArrayList;

public class Week4 {

    static void firstTask(){
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
            if ( i % 20 == 0 && i != 0 )
                System.out.println();
        }
    }

    static void secondTask(){
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void fibonacciUnder100(){

        int numberN, numberNMinus1=1, numberNMinus2=1;

        do {
            numberN = numberNMinus1 + numberNMinus2;

            if ( numberN < 100 )
                System.out.print(numberN + ", ");

            numberNMinus2 = numberNMinus1;
            numberNMinus1 = numberN;

        } while( numberN < 100 );
    }
}
