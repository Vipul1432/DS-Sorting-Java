import java.util.Scanner;

public class BubbleSort {
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
        int counter = 1;
        while (counter < n) {
            for (int i = 0; i < n - counter; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            counter++;
        }
        System.out.println("The sorted array are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        sc.close();
    }
}
