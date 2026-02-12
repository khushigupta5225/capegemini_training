package Coding_09_01_26;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =0;i<num;i++){
            for(int j = num-1-i;j>0;j--){
                System.out.print("   ");
            }
            for(int k =0;k<=i;k++){
                System.out.print(" * ");
            }
            for(int m = 0;m<i;m++){
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
}
