import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int fact = solve(A);
        if(fact==2){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
    public static int solve(int A){
        int count = 0;
        for(int i=1;i*i<=A;i++){
            if(A%i==0){
                if(i*i==A){
                    count++;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }
}
