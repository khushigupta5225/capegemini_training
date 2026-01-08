package Level2_08_01_26;

import java.util.Scanner;

public class splitTextIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int customLength = findLength(str);
        splitString(str);
    }

    public static void splitString(String str) {
        int words = 1;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==' '){
                words++;
            }
        }
        int[] arr = new int[words];

    }

    public static int findLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }
        catch (RuntimeException e){
            System.out.println("Exception handled");
        }
        return count;

    }
}

//Problem 2

//Write a program to split the text into words, compare the result with the split() method and display the result
//Hint =>
//Take user input using the Scanner nextLine() method
//Create a Method to find the length of the String without using the built-in length() method.
//Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
//Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
//Then Create an array to store the words and use the indexes to extract the words
//Create a method to compare the two String arrays and return a boolean
//The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result
