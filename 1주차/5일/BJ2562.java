import java.util.Scanner;
 
public class BJ2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max=-213;
		int res=0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
				res = i+1;
			}
		}
		
		System.out.println(max +"\n"+res);
        sc.close();
		
	}
}