import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10871 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        String[] str = new String[10];

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        str = br.readLine().split(" ");

        for(int i=0;i<N;i++){
            int tmp = Integer.parseInt(str[i]);
            if(X > tmp) System.out.print(tmp+" ");
        }

        
	}
}
