package PracticeQuesForM1;

import java.util.*;
import java.util.Scanner;

public class MaxOccuringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Integer> mp = new HashMap<>();

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        char ans = 'a';
        int val = 0;
        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            if(val<entry.getValue()){
                val = entry.getValue();
                ans = entry.getKey();
            }
        }
        int count = 0;
        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            if(val==entry.getValue()){
                count++;
            }
        }

        if(count==1){
            System.out.println(ans);
        }
        else{
            System.out.println("0");
        }

    }
}
