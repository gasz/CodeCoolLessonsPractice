package com.company;

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
}
