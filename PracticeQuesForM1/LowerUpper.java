package PracticeQuesForM1;

import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int upper = 0;
        int lower = 0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }
            else{
                lower++;
            }
        }
        StringBuilder sb = new StringBuilder();
        if(upper>lower){
            sb.append(str.toUpperCase());
        }
        else{
            sb.append(str.toLowerCase());
        }
        System.out.println(sb.toString());
    }
}
