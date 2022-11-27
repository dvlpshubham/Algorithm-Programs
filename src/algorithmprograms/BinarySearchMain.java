package algorithmprograms;

import java.util.Arrays;

public class BinarySearchMain {
    public static void main(String[] args) {
        String[] arr = { "contribute", "geeks", "practice","ide", "apple","zebra"};
        String x = "zebra";
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        BinarySearch<String> bs = new BinarySearch<String>();
        int result = bs.binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}

