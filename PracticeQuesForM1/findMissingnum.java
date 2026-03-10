package PracticeQuesForM1;

import java.util.Scanner;

public class findMissingnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i =1;i<=n+1;i++){
            sum+=i;
        }
        int sum2 = 0;
        for(int i =0;i<n;i++){
            sum2+=arr[i];
        }
        System.out.println(sum-sum2);
    }
}
