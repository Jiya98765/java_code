import java.util.*;

public class table_create {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int start = h.nextInt();
        int end = h.nextInt();

        for (int i = start; i < end; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}