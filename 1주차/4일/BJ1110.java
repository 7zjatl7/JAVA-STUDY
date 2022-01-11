import java.util.Scanner;

public class BJ1110 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int input = A;
        int B=0;
        int tmp=0;
        int cnt=0;
        int res=0;
        
        while(true){
            if(cnt == 0){
                B = A % 10;
                A /= 10;
                tmp = A+B;
                if(tmp >= 10) tmp %= 10;
                cnt = 1;
                
            }
            else{
                B = res % 10;
                res /= 10;
                tmp = res+B;
                if(tmp >= 10) tmp %= 10;
                cnt++;
            }
            String sum = String.valueOf(B+""+tmp);
            res = Integer.parseInt(sum);
            if(input == res) break;
            
        }
        System.out.println(cnt);
        sc.close();
    
    }
}
