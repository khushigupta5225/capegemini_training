package PracticeQuesForM1;

import java.util.*;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Integer> mp = new LinkedHashMap<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer>entry : mp.entrySet()){
            System.out.print(entry.getKey());
        }

    }
}
