package PracticeQuesForM1;

import java.util.Scanner;

public class ZeroOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int count =-1;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch=='1'){
                count++;
            }
            else{
                char c = (char) ('A' + count);
                sb.append(c);
                count = -1;
            }

        }
        if(count > 0){
            char c = (char)('A' + count);
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
