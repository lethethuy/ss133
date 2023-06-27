package thuchanh2;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            // tim vi tri tuong ung cua ky tu trong bang ASCII
            int ascii = inputString.charAt(i);

            // tang gia tri tan suat
            frequentChar[ascii] += 1;

            int max = 0;
            char character = 255;
            for (int j = 0; j < 255; j++) {
                if (frequentChar[j] > max) {
                    max = frequentChar[j];
                    character = (char) j;
                }
            }
            System.out.println("Phan tu " + character + " xuat hien so lan la: " + max);
        }

    }
}
