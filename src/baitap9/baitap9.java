package baitap9;

import java.util.Arrays;
import java.util.Scanner;

public class baitap9 {  public static void main(String[] args) {
    int[] arr = createArray();
    int min = getMinValue();
    int max = getMaxValue();

    int closestMinIndex = findClosestGreaterValueIndex(arr, min);
    int closestMaxIndex = findClosestSmallerValueIndex(arr, max);

    System.out.println("Số lượng số tìm thấy: " + (closestMaxIndex - closestMinIndex + 1));
    System.out.println("Chi tiết các số: " + Arrays.toString(Arrays.copyOfRange(arr, closestMinIndex, closestMaxIndex + 1)));
}

    public static int[] createArray() {
        int[] arr = {2, 5, 7, 9, 12, 15, 18, 20};
        return arr;
    }

    public static int getMinValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị min: ");
        int min = scanner.nextInt();
        return min;
    }

    public static int getMaxValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị max: ");
        int max = scanner.nextInt();
        return max;
    }

    public static int findClosestGreaterValueIndex(int[] arr, int target) {
        int closestIndex = -1;
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target && arr[i] - target < minDifference) {
                closestIndex = i;
                minDifference = arr[i] - target;
            }
        }

        return closestIndex;
    }

    public static int findClosestSmallerValueIndex(int[] arr, int target) {
        int closestIndex = -1;
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < target && target - arr[i] < minDifference) {
                closestIndex = i;
                minDifference = target - arr[i];
            }
        }

        return closestIndex;
    }

}
