package Arrays.LogicBuilding;
import java.util.*;
public class Freq_of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // If the element is already counted, skip it
            if (arr[i] == -1) {
                continue;
            }

            int count = 1;
            // Look ahead to find duplicates
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1; // Mark as counted
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");

        }
    }
}

