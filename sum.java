import java.util.*;

class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int sum = 0;
        for (int i = start; i <= end; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                sum = sum + i;
            }

        }
        System.out.print(sum + " ");
    }
}//