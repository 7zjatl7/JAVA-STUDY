import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class BJ4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		String[] str = new String[num];
        int[] arr = new int[10];
        StringTokenizer st;

		for (int i = 0; i < num; i++) {

            st = new StringTokenizer(br.readLine()," ");

            int n = Integer.parseInt(st.nextToken());
            arr = new int[n];

            double sum = 0;

            for(int j=0; j<n; j++ ){
                int val = Integer.parseInt(st.nextToken());
                arr[j] = val;
                sum += val;
            }

			double mean = (sum / n) ;
			double count = 0; 
			
			for(int j = 0 ; j < n ; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/n)*100);
        }
        
	}
}