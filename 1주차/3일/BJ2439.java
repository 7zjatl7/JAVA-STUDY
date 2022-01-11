import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2439 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i=1;i<tc+1;i++){
            for(int j=tc-i;j>0;j--){
                sb.append(" ");
            }
            for(int k=1;k<i+1;k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        
	}
}
