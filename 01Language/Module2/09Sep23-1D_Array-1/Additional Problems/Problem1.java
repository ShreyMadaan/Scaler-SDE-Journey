import java.util.*;

public class Problem1 {
    public static int[] rev(int[]A){
        int n = A.length;
        int []B = new int[n];
        for(int i=0; i<n; i++){
            B[n-i-1]=A[i];
        }
        return B;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []A= new int[n];
        for (int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        int []B = rev(A);

        for(int i=0; i<n; i++){
        System.out.print(B[i] + " ");
        }
    }
}
