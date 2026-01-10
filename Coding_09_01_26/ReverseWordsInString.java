package Coding_09_01_26;

import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String result = "";
        for(int i =0;i<arr.length;i++){
            result = result + reverse(arr[i]);
            if(i!=arr.length-1)
                result += " ";
        }
        System.out.println(result);

    }
    public static String reverse(String s){
        int j = s.length()-1;
        String ans = "";
        while(j>=0){
            ans += s.charAt(j);
            j--;

        }
        return ans;
    }

}
