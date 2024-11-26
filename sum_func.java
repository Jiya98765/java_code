import java.util.*;

class sum_func {
    static int sum_fun(int start, int end) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= end; i++) {

            if (i % start == 0) {
                sum1 = sum1 + i;
            } else {
                sum2 = sum2 + i;
            }

        }
        return (sum2 - sum1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.print(sum_fun(start, end));

    }
}