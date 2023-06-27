package baitap5;

import java.util.Arrays;
import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = getInputArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhap gia tri can tim: ");
        int target= scanner.nextInt();
        int result = binarySearch(arr,target);
        if (result!=-1){
            System.out.println("Gia tri "+target+  " duoc tim thay.");
        }else {
            System.out.println("Gia tri "+ target+ " khong duoc tim thay." );
        }



        //
    }
    public static int[] getInputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu muon them vao mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap cac phan tu cua mang da sap xep theo thu tu tang dan: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right =arr.length-1;

        while (left<=right){
            int mid = left + (right-left)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (arr[mid]<target){
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }

}
