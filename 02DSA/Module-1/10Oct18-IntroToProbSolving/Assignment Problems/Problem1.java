import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int fact = solve(A);
        System.out.println("Number " + A +" has "+fact +" factors" );
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
