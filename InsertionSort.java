import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.print("Enter size of an array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            // reading array elements from the user
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int current = array[i];
            int j = i - 1;
            while (array[j] > current && j >= 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        System.out.println("The sorted array are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}
