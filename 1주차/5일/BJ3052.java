import java.util.Scanner;

public class BJ3052 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int[] arr = new int[10];
        int[] ch = new int[42];

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++){
            ch[arr[i] % 42]++;
        }

        for(int i=0; i<ch.length; i++){
            if(ch[i] > 0) cnt++;
        }

        System.out.println(cnt);

    }
}


