import java.util.Scanner;

public class BJ2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C;
		String len;
		int mul;
		int tmp;
		int[] check = new int[10];
		
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		len = String.valueOf(A*B*C);
		mul = A*B*C;
		
		for(int i=0; i<len.length(); i++) {
			tmp = mul % 10;
			check[tmp] += 1;
			mul /= 10;
		}
		for(int i=0; i<10; i++) {
			System.out.println(check[i]);
		}
		
		
	}
}
