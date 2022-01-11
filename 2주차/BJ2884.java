import java.util.Scanner;

public class BJ2884 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int time = 45;

        int H = sc.nextInt();
        int M = sc.nextInt();

        if(H > 0 && M >= 45) System.out.printf("%d %d",H,M - 45);
        else if (H > 0 && M < 45){
            time -= M;
            System.out.printf("%d %d",H-1, 60-time);
        } 
        else if(H == 0 && M >= 45) {
            System.out.printf("0 %d", M - 45);
        }
        else if(H == 0 && M < 45) {
            time -= M;
            System.out.printf("23 %d", 60-time);
        }
        sc.close();

        
    }
}