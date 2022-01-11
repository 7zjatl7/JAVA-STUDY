import java.util.Scanner;

public class BJ1546 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int max=-213;
        int n;
        double sum=0;
        n = sc.nextInt();

        int[] arr = new int[n];
        

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]) max = arr[i];
        }

        for(int i=0; i<n; i++){
            sum += ((double)arr[i] / max)*100;

        }

        System.out.printf("%.2f",sum/n);

    }
}


