import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ1000 {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String n = br.readLine();

    String[] str = n.split(" ");

    int n1 = Integer.parseInt(str[0]);
    int n2 = Integer.parseInt(str[1]);

    System.out.println(n1 + n2);
  }
}
