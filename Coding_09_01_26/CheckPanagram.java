package Coding_09_01_26;

import java.util.Scanner;

public class CheckPanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // my name is khushi
        String str = sc.nextLine();
        str = str.replace(" ","");
        int[] freq = new int[26];
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        int flag = 1;
        for(int i=0;i<26;i++){
            if(freq[i]==0){
               flag = 0;
                break;
            }
        }
        if(flag==1){
            System.out.println("Panagram");
        }
        else{
            System.out.println("Not Panagram");
        }
    }
}
