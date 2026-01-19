import java.util.Scanner;

public class CheckPalindromeForTnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=1;i<=T;i++){
            int num = sc.nextInt();
            int rev = 0;
            int temp = num;
            while(temp>0){
                int ld = temp%10;
                rev = rev*10 + ld;
                temp/=10;
            }
            if(rev==num){
                System.out.println("Palindrome");
            }else{
                System.out.println("Not a Palindrome");
            }
        }
    }
}