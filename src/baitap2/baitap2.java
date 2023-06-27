package baitap2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class baitap2 {
    public static void main(String[] args) {
        //buoc 1: gan gia tri cho mang so nguyen
        int[] arr = getArr();
        // buoc 2: In ra mang so nguyen
        System.out.println("mang so nguye la: "+ Arrays.toString(arr));
        // buoc3: Tim so nho nhat bang thuat toan sap xep
        int minNum = linearSearchMin(arr);

        // buoc4: in ra so nho nhat
        System.out.println("So nho nhat trong mang la: "+ minNum);

        ArrayList<Integer> arrayList = new ArrayList<>(arr.length);
        for (int num :arr
             ) {
            arrayList.add(num);
        }
        System.out.println("ArrayLsit la: " + arrayList);


        // xoa phan tu cuoi cung
        Collections.sort(arrayList);
        System.out.println("ArrayList sau khi sap xep" +arrayList);
        // xoa phan tu be nhat
        System.out.println("Phan tu lon thu 2 trong ArrayList " + arrayList.get(1));



    }

    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        return arr;
    }
    public static int linearSearchMin(int[] arr){
        int minNum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minNum){
                minNum = arr[i];
            }
        }
        return minNum;
    }
    public static int linearSearchMin2(ArrayList<Integer> arrayList){
        int minNum = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) <minNum){
                minNum = arrayList.get(i);
            }
        }
        return minNum;
    }

}
