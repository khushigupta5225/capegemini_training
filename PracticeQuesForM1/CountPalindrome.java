package PracticeQuesForM1;

import java.util.Scanner;

public class CountPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split("\\s+");

        int count =0;
        for(int i =0;i<word.length;i++){
            if(checkPalindrome(word[i])){
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean checkPalindrome(String s) {
        int i =0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
