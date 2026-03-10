package PracticeQuesForM1;

import java.util.Scanner;

public class ReverseNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int l_d = n%10;
            if(l_d!=0){
                rev = rev*10+l_d;
            }
            n = n/10;
        }
        System.out.println(rev);
    }
}
