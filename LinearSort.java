import java.util.Scanner;

public class LinearSort {
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
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("The sorted array are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}