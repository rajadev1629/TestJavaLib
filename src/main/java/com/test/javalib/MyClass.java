package com.test.javalib;

/*
@Param as any interger number less than 30
*/
public class MyClass {
    public static void printSquare(int upperBound) {
        for (int i = 0; i < upperBound; i++) {
            System.out.println(String.format("Number:: %1$4s  Square:: %2$4s", i, i * i));

        }
    }
}
