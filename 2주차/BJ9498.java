import java.util.Scanner;

public class BJ9498 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int grade = sc.nextInt();

        if(grade >= 90 && grade <= 100) System.out.print("A");
        else if(grade >= 80 && grade <= 89) System.out.print("B");
        else if(grade >= 70 && grade <= 79) System.out.print("C");
        else if(grade >= 60 && grade <= 69) System.out.print("D");
        else System.out.print("F");
        sc.close();
    }
}
