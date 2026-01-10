package Coding_09_01_26;

import java.util.Scanner;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i =0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i =0;i<num;i++){
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>second){
                second = arr[i];
            }
        }
        System.out.println(second);

    }
}
