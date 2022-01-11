import java.util.Scanner;

public class BJ2739 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=1; i<10; i++){
            System.out.printf("%d * %d = %d\n",N, i, N*i);
        }
        sc.close();
    }
}
