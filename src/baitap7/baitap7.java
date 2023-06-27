package baitap7;

import java.util.Scanner;

public class baitap7 {
    public static void main(String[] args) {
        String[] arr = createStringArrays();
        String word = getSearchTarget();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)){
                System.out.println("Tim thay phan tu "+ word + " o vi tri index thu: "+ (i+1));
                found=true;
            }
        }
        System.out.println(found);

    }
    public static String[] createStringArrays(){
        String[] arr = {"apple", "banana", "orange"};
        return arr;
    }
    public static String getSearchTarget(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu can tim");
        String word = scanner.nextLine();
        return word;
    }
}
