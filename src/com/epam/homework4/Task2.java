package com.epam.homework4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String string = sc.nextLine();

        if (FindSymbols(string) == "") System.out.println("Unique symbols don't find from \033[31m" + string );
        else System.out.println("Symbols " + "\033[31m" + FindSymbols(string) + " " + "\033[0m" + "from " + string +  " are unique" );
    }

    static String FindSymbols(String string) {
        String symbol = "";
        for (int i = 0; i < string.length(); i++) {
            boolean Unique = true;
            for (int k= 0; k < string.length(); k++){
                if (i != k && string.charAt(i) == string.charAt(k))
                {
                    Unique = false;
                    break;
                }
            }
            if (Unique == true){
                symbol += string.charAt(i);
            }
        }
        return symbol;
    }
}
