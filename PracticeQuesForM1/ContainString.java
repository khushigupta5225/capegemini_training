package PracticeQuesForM1;

import java.util.Scanner;

public class ContainString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();

        if(str.contains(s)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
