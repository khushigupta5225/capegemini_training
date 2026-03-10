package PracticeQuesForM1;

import java.util.Scanner;

public class HikeTrail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int greatest = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>greatest){
                greatest = arr[i];
            }
        }
        System.out.println(greatest);
    }
}
