import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        int N = S.nextInt();
        
        for(int i=1;i<=N;i++){
            if(i%15==0){
                System.out.println("FizzBuzz");
                continue;
            }
            else if(i%5==0){
                System.out.println("Buzz");
                continue;
            }
            else if(i%3==0){
                System.out.println("Fizz");
                continue;
            }
            else
                System.out.println(i);
        }
    }
}
