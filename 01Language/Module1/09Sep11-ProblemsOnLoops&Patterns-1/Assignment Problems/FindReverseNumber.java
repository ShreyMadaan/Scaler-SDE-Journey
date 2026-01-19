import java.util.Scanner;

public class FindReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==0){
            System.out.println(n);
        }
        boolean sign = false;
        if(n<0){
            sign = true;
            n = n*(-1);
        }
        int rev = 0;
        while(n>0){
            int lastDigit = n%10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        if(sign){
            rev *= -1;
        }
        System.out.println(rev);
    }
}