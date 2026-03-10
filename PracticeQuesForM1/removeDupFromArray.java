package PracticeQuesForM1;

import java.util.*;

public class removeDupFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Set<Integer> st = new LinkedHashSet<>();
        for(int i =0;i<n;i++){
            st.add(arr[i]);
        }
        for(int k:st){
            System.out.print(k+" ");
        }
    }
}
