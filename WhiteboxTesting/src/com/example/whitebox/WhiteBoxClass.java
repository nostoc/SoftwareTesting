package com.example.whitebox;

/**
 * White-box Testing examples explained by the Aritmethic Exception
 * Written by Peri Hill on Sat, March 26th 2022.
 *
 * This examples show that even a method 100% statement/branch coverage achieved,
 * it can still have errors and cause exceptions.
 */
public class WhiteBoxClass {

    // This method will throw an ArithmeticException when b=0
    public static int test01(int a, int b){
        int division;

        if(b >= 0){
            division = a/b;
        } else{
            division = a+b;
        }
        return division;
    }

    // This method will throw an ArithmeticException when y=0
    public static int test02(boolean a, boolean b, int y){
        int x = 15;

        if(a)
            x = x/y + 3;
        if(b)
            x = x/y + 8;

        return x;
    }

    // This method will throw an ArithmeticException when y=0
    public static int test03(boolean a, boolean b, int y){
        int x = 30;

        if(a)
            x = x/y*2 + 7;

        if(b)
            x = x/y*2 + 15;

        return x;
    }

    public static boolean test04(boolean a, boolean b){
        int x = -6;
        int y = 5;

        if(a)
            x += 2;
        else
            y = 3 * x + 1;

        if(b)
            x += 3;
        else
            y += 3;

        return y -x > 16 ;
//        int z = y - x;
//        if(16 / z > 0){
//            return true;
//        } else {
//            return false;
//        }
    }

}
