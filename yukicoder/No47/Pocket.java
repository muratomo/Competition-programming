import java.util.Scanner;

public class Pocket {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int N = S.nextInt();
        
        if(N==1)
            System.out.println(0);
        else
            System.out.println(Integer.toBinaryString(N-1).length());
    }
}
