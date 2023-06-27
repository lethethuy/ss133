package baitap1;

import java.util.Arrays;

public class baitap1 {


    public static void main(String[] args) {
        // buoc 1: Gan gia tri cho mang so nguyen
        int[] arr = getArr();

        // buoc 2: In ra mang so nguyen
        System.out.println("Mang so nguyen la:");
        System.out.println(Arrays.toString(arr));

        // buoc 3: Tim so lon nhat bang thuat toan tuyen tinh
        int maxNum = linearSearchMax(arr);

        // buoc 4: In ra so lon nhat
        System.out.println("So lon nhat trong mang la: "+ maxNum);


    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static int linearSearchMax(int[] arr) {
        int maxNum = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i]>maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

}
