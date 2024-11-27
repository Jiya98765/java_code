
import java.util.Scanner;

public class swap_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Input array elements
        for (int i = 0; i < 5; i++) { // Use i < 5 for cleaner syntax
            arr[i] = sc.nextInt(); // Corrected from arr[5] to arr[i]
        }

        // Output array elements
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " "); // Added space for better formatting
        }
        int a=0;
        int b= 4;

        while(arr[a]<arr[b])
        {
            swap(arr[a],arr[b]);
            a++;
            b--;
            
        }
        for(int i=0; i<5 ; i++)
        {
            System.out.print(arr[i]+" ");
        }

        sc.close(); // Close the Scanner
    }
}
