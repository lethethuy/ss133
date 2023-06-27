import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hung");

    }
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int hight = list.length-1;
        while (hight>=0){
            int mid = (low+hight)/2;
            if (key<list[mid]){
                hight = mid-1;
            }else if (key==list[mid]){
                return mid;
            }else {
                low = mid +1;
            }
        }
        return -1;
    }


}