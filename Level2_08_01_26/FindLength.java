package Level2_08_01_26;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int customLength = findLength(str);
        int builtInLength = str.length();

        System.out.println("Length without using length(): " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);

//        int len = 0;
//        for (char ch : str.toCharArray()) {
//            len++;
//        }
//        System.out.println("Length of String: "+ len);

    }

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {              // infinite loop
                str.charAt(count);      // throws exception when index is invalid
                count++;
            }
        }
        catch (RuntimeException e) {
            // Exception handled
        }

        return count;
    }
}

//Problem 1

//Write a program to find and return the length of a string without using the length() method
//Hint =>
//Take user input using the Scanner next() method
//Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
//The main function calls the user-defined method as well as the built-in length() method and displays the result

