package PracticeQuesForM1;

import java.util.Scanner;

public class CodingQuesForM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while(n>0){
            for(int i =0;i<str.length();i++){
                sb.append(str.charAt(i));
            }
            n--;
        }
        System.out.println(sb.toString());
    }
}
