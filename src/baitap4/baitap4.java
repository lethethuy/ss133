package baitap4;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 18, 20};
        System.out.println("Nhap vao so can tim");
        int number = scanner.nextInt();
        boolean find = false;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == number) {
                System.out.println(number + " nam o vi tri index: " + i);
                find = true;
                break;
            }

        }
        if (!find){
            System.out.println("khong tim thay " + number + " trong mang");
        }


    }
}
