import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1) Taking array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // 2) Taking array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 3) Printing array elements
        System.out.println("\nArray elements are:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        // 4) Sum of elements
        int sum = 0;
        for (int x : arr) {
            sum = sum + x;
        }
        System.out.println("\n\nSum = " + sum);

        // 5) Maximum element
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Max = " + max);

        // 6) Minimum element
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Min = " + min);

        // 7) Search element (Linear Search)
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println(key + " found at index: " + position);
        } else {
            System.out.println(key + " not found in array");
        }

        // 8) Reverse printing array
        System.out.println("\nArray in Reverse order:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        // 9) Sorting array (Bubble Sort Ascending)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nSorted Array (Ascending):");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
