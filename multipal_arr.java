import java.util.Scanner;

public class multipal_arr {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int [][] arr= new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = h.nextInt();
            }
            
        }

        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        h.close();

    }
}

