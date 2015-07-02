import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        double a = S.nextDouble();
        double b = S.nextDouble();

        System.out.println((int)Math.ceil(b/a));
    }
}
