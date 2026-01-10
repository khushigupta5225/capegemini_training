package Coding_09_01_26;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        while(n>0){
            System.out.println(c);
            a = b;
            b = c;
            c = a +b;
            n--;
        }
    }
}
