import java.util.Scanner;

public class LastDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int lastDigit = num % 10;
        System.out.println(lastDigit);
    }
}