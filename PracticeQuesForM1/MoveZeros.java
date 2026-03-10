package PracticeQuesForM1;

import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int zero =0;
        int[] ar = new int[n];
        int k =0;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }
            else{
                ar[k] = arr[i];
                k++;
            }
        }
        int ind = ar.length;
        while(zero>0){
            ar[k] = 0;
            zero--;
        }
        for(int i =0;i<ind;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
