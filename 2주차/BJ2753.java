import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ2753 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()," ");
        int year = Integer.parseInt(st.nextToken());

        if(year % 4 == 0){
            if(year % 100 != 0 || year % 400 == 0) System.out.print("1");
            else System.out.print("0");
        }
        else System.out.print("0");
	}
}