import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static void insertionSort1(int n, List<Integer> arr) {
        int unsorted = arr.get(n - 1);      // rightmost element 
        int i = n - 2;                      // second rightmost element 
        while (i >= 0 && arr.get(i) > unsorted) {      
            arr.set(i + 1, arr.get(i));             // set the element ( comparing)
            printArray(arr);                        // display the elements 
            i--;
        }
        arr.set(i + 1, unsorted);
        printArray(arr);
    }

    public static void printArray(List<Integer> arr) {   // display the array integer
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

public class insertion_sort {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
