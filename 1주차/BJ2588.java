import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BJ2588{

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n1 = Integer.parseInt(br.readLine());
    String n2 = br.readLine();
    String[] str2 = n2.split("");

    for (int i = 2; i >= 0; i--) {
        int tmp = Integer.parseInt(str2[i]);
        System.out.println(n1 * tmp);
    }
    System.out.print(n1 * Integer.parseInt(n2));
}
}