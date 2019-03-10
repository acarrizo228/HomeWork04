package com.epam.homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        String str = TranslateToBinary(number);
        System.out.println( "Your number in binary:  " + str);

    }


    static String TranslateToBinary(int number)
    {
        final int DIVIDE = 2;
        String string = "";
        while (number > 0)
        {
            string =  ((number % DIVIDE) == 0 ? "0" : "1") + string;
            number = number/2;
        }
        return string;
    }
}
