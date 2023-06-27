package baitap3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        // Tao mang 2  chieu va gan gia tri
        int[][] arr = getArr();
        System.out.println("mang 2 chieu la: ");
        for (int i = 0; i< arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf(" %-2d", arr[i][j]);
            }
            System.out.println();
        }

        // Tao 2 List laf int de luu nhung vi tri so do xuat hien
        List<Integer> colList = new ArrayList<>();
        List<Integer> rowList = new ArrayList<>();

        // // buoc 4: tap bien check kdl boolean, mac dinh bang boolean
        boolean check = false;

        // buoc 5:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap vao 2 so: ");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if (arr[i][j]==number){
                    colList.add(i);
                    rowList.add(j);
                    check = true;
                }
            }
        }

        // buoc 6: In ra vi tri vaf tra ve bien check
        if (check){
            System.out.println("So "+number + " xuat hien tai vi tri sau: " );
            for (int i = 0; i < rowList.size(); i++) {
                int row = rowList.get(i);
                int col = colList.get(i);
                System.out.println("col "+ row + " row "+ col);
            }
        }else{
            System.out.println("So 7 khong xuat hien");
        }

    }
    private static int[][] getArr(){
        int arr[][] = new int[20][20];
        for (int i = 0; i< arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]= (int) (Math.random()*100);
            }
        }
        return arr;
    }


}
