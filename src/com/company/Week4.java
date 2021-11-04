package com.company;

import java.util.ArrayList;

public class Week4 {

    static String[] anArray = {"moo","bark","meow","rawr","screech","chirp","growl","buzz","quack"};
    static ArrayList<String> anArrayList = new ArrayList<>();

    static void firstTask(){
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
            if ( i % 20 == 0 && i != 0 && i != 100 )
                System.out.print("\n");
        }
    }

    static void secondTask(){
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        System.out.print(sum);
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

    static void fourthTask(){
        for (String aString: anArray)
            System.out.print(aString + ", ");
    }

    static void fifthTask(){
        for (String aString :
                anArray) {
            anArrayList.add(aString);
        }
        System.out.print(anArrayList.toString());
    }

    static void sixthTask(){
        StringBuilder firstLetters = new StringBuilder();
        for (String aString :
                anArrayList) {
            firstLetters.append(aString.charAt(0));
        }
        System.out.print(firstLetters);
    }
}
