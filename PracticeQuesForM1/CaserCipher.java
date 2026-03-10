package PracticeQuesForM1;

import java.util.Scanner;

public class CaserCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'){
                sb.append('x');
            }
            if(ch=='b'){
                sb.append('y');
            }
            if(ch=='c'){
                sb.append('z');
            }
            sb.append((char)(ch-3));
        }
        System.out.println(sb.toString());
    }
}
