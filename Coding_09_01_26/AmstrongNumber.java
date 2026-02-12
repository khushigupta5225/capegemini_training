package Coding_09_01_26;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum =0;
        while(n>0){
            int l_d = n %10;
            int cube = l_d * l_d * l_d;
            sum += cube;
            n = n /10;
        }
        if(temp==sum){
            System.out.println("Amstrong");
        }
        else{
            System.out.println("Not an Amstrong");
        }

    }
}
