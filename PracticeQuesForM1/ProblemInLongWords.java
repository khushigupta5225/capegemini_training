package PracticeQuesForM1;

import java.util.Scanner;

public class ProblemInLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//localization
        StringBuilder sb = new StringBuilder();
        if(str.length()>=10){
            int n = str.length()-2;
            sb.append(str.charAt(0));
            sb.append(n);
            sb.append(str.charAt(str.length()-1));
            System.out.println(sb.toString());
        }
        else{
            System.out.println(str);
        }
    }
}
