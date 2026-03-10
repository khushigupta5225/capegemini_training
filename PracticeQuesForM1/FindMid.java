package PracticeQuesForM1;

import java.util.*;

public class FindMid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            if(arr[i] >= 0){
                list.add(arr[i]);
            }
        }

        int mid = (list.size() - 1) / 2;

        System.out.println(list.get(mid));
    }
}
