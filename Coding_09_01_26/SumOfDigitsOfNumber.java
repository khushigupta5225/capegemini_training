package Coding_09_01_26;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        while(num>0){
            int l_d = num % 10;
            sum += l_d;
            num = num /10;

        }
        System.out.println(sum);
    }
}
