import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ1008 {
  public static void main(String[] args) throws Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String n = br.readLine();

    String[] str = n.split(" ");

    double n1 = Double.parseDouble(str[0]);
    double n2 = Double.parseDouble(str[1]);

    System.out.println(n1 / n2);

  }

}