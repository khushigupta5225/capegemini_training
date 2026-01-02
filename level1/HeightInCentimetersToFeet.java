package level1;

import java.util.Scanner;

public class HeightInCentimetersToFeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heightInCentimeters = scanner.nextInt();
        double totalInches = heightInCentimeters / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        System.out.println("Your height in cm is " + heightInCentimeters + " while in feet is " + feet + " and inches is " + inches);

    }
}

//Problem 10

//Write a program that takes your height in centimeters and converts it into feet and inches
//Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
//I/P => height
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
