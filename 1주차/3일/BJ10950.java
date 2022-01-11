import java.util.Scanner;

public class BJ10950 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N=sc.nextInt();

        for(int i=0;i<N;i++){
            int A = sc.nextInt();            
            int B = sc.nextInt();
            
            System.out.println(A+B);
        }        
        sc.close();
    }
}
