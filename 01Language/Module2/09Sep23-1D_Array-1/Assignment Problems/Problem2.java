import java.util.*;


public class Problem2 {
    public static int sum(int[]A){
        int n = A.length;
        int sum=0;
        for(int i=0; i<n;i++){
            sum+=A[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(sum(A));
    }
}
